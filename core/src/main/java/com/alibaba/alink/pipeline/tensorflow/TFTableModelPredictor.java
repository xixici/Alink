package com.alibaba.alink.pipeline.tensorflow;

import org.apache.flink.ml.api.misc.param.Params;

import com.alibaba.alink.operator.common.tensorflow.TFTableModelPredictModelMapper;
import com.alibaba.alink.params.tensorflow.savedmodel.TFTableModelPredictParams;
import com.alibaba.alink.pipeline.MapModel;

public class TFTableModelPredictor extends MapModel <TFTableModelPredictor>
	implements TFTableModelPredictParams <TFTableModelPredictor> {

	public TFTableModelPredictor() {this(null);}

	public TFTableModelPredictor(Params params) {
		super(TFTableModelPredictModelMapper::new, params);
	}
}