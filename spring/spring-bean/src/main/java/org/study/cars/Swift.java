 package org.study.cars;

import org.springframework.stereotype.Component;
import org.study.interfaces.Car;

public class Swift implements Car {

	@Override
	public String specs() {
		return "Hatchback from Suzuki";
	}
}
