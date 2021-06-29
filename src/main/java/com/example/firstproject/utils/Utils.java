package com.example.firstproject.utils;

import org.apache.commons.lang3.StringUtils;

public class Utils {

	private Utils() {
	}

	public static String getEnvironmentConfig(String propName) {
		if (StringUtils.isNotBlank(propName)) {
			String propValue = System.getenv(propName);
			if (StringUtils.isBlank(propValue)) {
				propValue = System.getProperty(propName);
			}
			return propValue;
		} else {
			return propName;
		}
	}

}
