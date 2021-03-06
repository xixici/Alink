package com.alibaba.alink.params.regression;

import com.alibaba.alink.params.mapper.ModelMapperParams;
import com.alibaba.alink.params.shared.colname.HasPredictionCol;

/**
 * Params for IsotonicRegressionPredictor.
 */
public interface IsotonicRegPredictParams<T> extends
	ModelMapperParams <T>,
	HasPredictionCol <T> {
}
