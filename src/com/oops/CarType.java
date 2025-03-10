package com.oops;

import java.util.List;

public enum CarType {

	SUV, SEDAN, SPORTS;

	public static CarType getType(String value) {
		return List.of("SUV", "SEDAN", "SPORTS").contains(value) ? CarType.valueOf(value) : CarType.SUV;
	}

}
