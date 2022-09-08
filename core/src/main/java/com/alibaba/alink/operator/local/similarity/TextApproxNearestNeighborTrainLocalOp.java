package com.alibaba.alink.operator.local.similarity;

import org.apache.flink.ml.api.misc.param.Params;

import com.alibaba.alink.common.annotation.NameCn;
import com.alibaba.alink.operator.batch.similarity.BaseNearestNeighborTrainBatchOp;
import com.alibaba.alink.operator.common.similarity.TrainType;
import com.alibaba.alink.operator.common.similarity.dataConverter.StringModelDataConverter;
import com.alibaba.alink.params.similarity.StringTextApproxNearestNeighborTrainParams;

/**
 * Find the approximate nearest neighbor of query texts.
 */
@NameCn("文本近似最近邻训练")
public class TextApproxNearestNeighborTrainLocalOp
	extends BaseNearestNeighborTrainLocalOp<TextApproxNearestNeighborTrainLocalOp>
	implements StringTextApproxNearestNeighborTrainParams<TextApproxNearestNeighborTrainLocalOp> {

	public TextApproxNearestNeighborTrainLocalOp() {
		this(new Params());
	}

	public TextApproxNearestNeighborTrainLocalOp(Params params) {
		super(params.set(StringModelDataConverter.TEXT, true)
			.set(BaseNearestNeighborTrainBatchOp.TRAIN_TYPE, TrainType.APPROX_TEXT));
	}
}
