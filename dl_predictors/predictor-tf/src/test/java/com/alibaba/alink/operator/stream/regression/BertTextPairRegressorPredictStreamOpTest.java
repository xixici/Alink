package com.alibaba.alink.operator.stream.regression;

import com.alibaba.alink.common.MLEnvironmentFactory;
import com.alibaba.alink.common.io.directreader.DataBridgeGeneratorPolicy;
import com.alibaba.alink.common.io.directreader.LocalFileDataBridgeGenerator;
import com.alibaba.alink.operator.batch.BatchOperator;
import com.alibaba.alink.operator.batch.source.CsvSourceBatchOp;
import com.alibaba.alink.operator.stream.StreamOperator;
import com.alibaba.alink.operator.stream.source.CsvSourceStreamOp;
import org.junit.Test;

public class BertTextPairRegressorPredictStreamOpTest {
	@Test
	public void test() throws Exception {
		System.setProperty("direct.reader.policy",
			LocalFileDataBridgeGenerator.class.getAnnotation(DataBridgeGeneratorPolicy.class).policy());
		int savedBatchParallelism = MLEnvironmentFactory.getDefault().getExecutionEnvironment().getParallelism();
		int savedStreamParallelism = MLEnvironmentFactory.getDefault().getStreamExecutionEnvironment().getParallelism();
		BatchOperator.setParallelism(1);
		StreamOperator.setParallelism(1);
		String url = "http://alink-algo-packages.oss-cn-hangzhou-zmf.aliyuncs.com/data/MRPC/train.tsv";
		String schemaStr = "f_quality double, f_id_1 string, f_id_2 string, f_string_1 string, f_string_2 string";
		StreamOperator <?> data = new CsvSourceStreamOp()
			.setFilePath(url)
			.setSchemaStr(schemaStr)
			.setFieldDelimiter("\t")
			.setIgnoreFirstLine(true)
			.setQuoteChar(null);
		BatchOperator <?> model = new CsvSourceBatchOp()
			.setFilePath("http://alink-test.oss-cn-beijing.aliyuncs.com/jiqi-temp/tf_ut_files/bert_text_pair_regressor_model.csv")
			.setSchemaStr("model_id bigint, model_info string, label_value double");
		BertTextPairRegressorPredictStreamOp predict = new BertTextPairRegressorPredictStreamOp(model)
			.setPredictionCol("pred")
			.setReservedCols("f_quality")
			.linkFrom(data);
		predict.print();
		StreamOperator.execute();
		BatchOperator.setParallelism(savedBatchParallelism);
		StreamOperator.setParallelism(savedStreamParallelism);
	}
}
