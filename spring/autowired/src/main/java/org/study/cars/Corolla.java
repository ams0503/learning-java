package org.study.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.study.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {
	
	
	Engine engine;
	
	
//	public void setEngine(Engine engine) {
//		engine.type="New V8 Engine";
//		this.engine = engine;
//	}
	@Autowired
	public Corolla(Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String specs() {
		String specs = "Sedan from Toyota with as engine "+engine.type;
		return specs;
	}


	
}
