package org.study.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.study.interfaces.Car;
import org.study.interfaces.Engine;

@Component("corolla")
public class Corolla implements Car {
	
	// 1:
//	@Autowired
//	Engine v6;
	
	//2:
	@Autowired
	@Qualifier("V8Engine")
	Engine engine;
	
	@Override
	public String specs() {
		String specs = "Sedan from Toyota with as engine "+engine.type();
		return specs;
	}


	
}
