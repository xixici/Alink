import tensorflow as tf
import sys
import time
from tensorflow.python.summary.writer.writer_cache import FileWriterCache as SummaryWriterCache
from flink_ml_tensorflow2.tensorflow_context import *


def build_graph():
    global a
    a = tf.compat.v1.placeholder(tf.float32, shape=None, name="a")
    b = tf.reduce_mean(a, name="b")
    r_list = []
    for i in range(1):
        v = tf.Variable(dtype=tf.float32, initial_value=tf.constant(1.0), name="v_" + str(i))
        c = tf.add(b, v, name="c_" + str(i))
        add = tf.compat.v1.assign(v, c, name="assign_" + str(i))
        sum = tf.compat.v1.summary.scalar(name="sum_" + str(i), tensor=c)
        r_list.append(add)

    global_step = tf.compat.v1.train.get_or_create_global_step()
    global_step_inc = tf.compat.v1.assign_add(global_step, 1)
    r_list.append(global_step_inc)
    return r_list


def map_func(context):
    tf.compat.v1.disable_v2_behavior()
    tf_context = TFContext(context)
    job_name = tf_context.get_role_name()
    index = tf_context.get_index()
    cluster_json = tf_context.get_tf_cluster()
    print (cluster_json)
    sys.stdout.flush()
    ckpt = tf_context.get_property("checkpoint_dir")
    cluster = tf.compat.v1.train.ClusterSpec(cluster=cluster_json)
    server = tf.compat.v1.train.Server(cluster, job_name=job_name, task_index=index)
    sess_config = tf.compat.v1.ConfigProto(allow_soft_placement=True, log_device_placement=False,
                                 device_filters=["/job:ps", "/job:worker/task:%d" % index])
    t = time.time()
    if 'ps' == job_name:
        from time import sleep
        while True:
            sleep(1)
    else:
        with tf.compat.v1.device(tf.compat.v1.train.replica_device_setter(worker_device='/job:worker/task:' + str(index), cluster=cluster)):
            train_ops = build_graph()
            try:
                hooks = [tf.compat.v1.train.StopAtStepHook(last_step=50)]
                with tf.compat.v1.train.MonitoredTrainingSession(master=server.target, config=sess_config,
                                                       checkpoint_dir=ckpt, hooks=hooks,
                                                       save_summaries_steps=1) as mon_sess:
                    while not mon_sess.should_stop():
                        print (mon_sess.run(train_ops, feed_dict={a: [1.0, 2.0, 3.0]}))
                        sys.stdout.flush()
                        time.sleep(1)
            finally:
                SummaryWriterCache.clear()


if __name__ == "__main__":
    map_func(context)
