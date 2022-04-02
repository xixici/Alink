package com.alibaba.alink.common.annotation;

import org.apache.flink.api.common.typeinfo.TypeInformation;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class ParamAnnotationUtils {

	static List <Class <?>> getAllInterfaces(Class <?> clz) {
		Set <Class <?>> visited = new HashSet <>();
		Queue <Class <?>> classes = new LinkedBlockingDeque <>();
		classes.add(clz);
		while (!classes.isEmpty()) {
			Class <?> c = classes.poll();
			if (visited.contains(c)) {
				continue;
			}
			visited.add(c);
			classes.addAll(Arrays.asList(c.getInterfaces()));
		}
		return new ArrayList <>(visited);
	}

	public static List <ParamSelectColumnSpec> getParamSelectColumnSpecs(Class <?> clz) {
		List <ParamSelectColumnSpec> specs = new ArrayList <>();
		List <Class <?>> interfaces = getAllInterfaces(clz);
		Queue <Annotation> q = new LinkedBlockingDeque <>();
		for (Class <?> anInterface : interfaces) {
			q.addAll(Arrays.asList(anInterface.getAnnotations()));
		}
		while (!q.isEmpty()) {
			Annotation annotation = q.poll();
			Class <? extends Annotation> annotationType = annotation.annotationType();
			if (annotationType.getName().startsWith("java.lang.")) {
				continue;
			}
			if (annotationType.equals(ParamSelectColumnSpec.class)) {
				specs.add((ParamSelectColumnSpec) annotation);
			}
			if (annotationType.equals(ParamSelectColumnSpecs.class)) {
				specs.addAll(Arrays.asList(((ParamSelectColumnSpecs) annotation).value()));
			} else {
				q.addAll(Arrays.asList(annotationType.getAnnotations()));
			}
		}
		return specs;
	}

	public static List <ParamMutexRule> getParamMutexRules(Class <?> clz) {
		List <ParamMutexRule> specs = new ArrayList <>();
		List <Class <?>> interfaces = getAllInterfaces(clz);
		Queue <Annotation> q = new LinkedBlockingDeque <>();
		for (Class <?> anInterface : interfaces) {
			q.addAll(Arrays.asList(anInterface.getAnnotations()));
		}
		while (!q.isEmpty()) {
			Annotation annotation = q.poll();
			Class <? extends Annotation> annotationType = annotation.annotationType();
			if (annotationType.getName().startsWith("java.lang.")) {
				continue;
			}
			if (annotationType.equals(ParamMutexRule.class)) {
				specs.add((ParamMutexRule) annotation);
			}
			if (annotationType.equals(ParamMutexRules.class)) {
				specs.addAll(Arrays.asList(((ParamMutexRules) annotation).value()));
			} else {
				q.addAll(Arrays.asList(annotationType.getAnnotations()));
			}
		}
		return specs;
	}

	public static HashSet <TypeInformation <?>> getAllowedTypes(ParamSelectColumnSpec spec) {
		HashSet <TypeInformation <?>> s = new HashSet <>();
		for (TypeCollections typeCollection : spec.allowedTypeCollections()) {
			s.addAll(Arrays.asList(typeCollection.getTypes()));
		}
		return s;
	}
}