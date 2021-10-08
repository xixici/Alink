package com.alibaba.alink.params.timeseries;

import org.apache.flink.ml.api.misc.param.ParamInfo;
import org.apache.flink.ml.api.misc.param.ParamInfoFactory;

import com.alibaba.alink.params.timeseries.holtwinters.HasSeasonalPeriod;

public interface ArimaAlgoParams<T> extends
	HasEstmateMethod <T>,
	HasSeasonalPeriod <T> {


	ParamInfo <int[]> ORDER = ParamInfoFactory
		.createParamInfo("order", int[].class)
		.setDescription("p,d,q")
		.setRequired()
		.build();

	default int[] getOrder() {
		return get(ORDER);
	}

	default T setOrder(int[] value) {
		return set(ORDER, value);
	}


	ParamInfo <int[]> SEASONAL_ORDER = ParamInfoFactory
		.createParamInfo("seasonalOrder", int[].class)
		.setDescription("p,d,q")
		.setOptional()
		.setHasDefaultValue(null)
		.build();

	default int[] getSeasonalOrder() {
		return get(SEASONAL_ORDER);
	}

	default T setSeasonalOrder(int[] value) {
		return set(SEASONAL_ORDER, value);
	}

}