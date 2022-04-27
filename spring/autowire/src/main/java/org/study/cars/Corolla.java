package org.study.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.study.interfaces.Car;
import org.study.interfaces.Engine;

@Component("corolla")
public class Corolla implements Car {
	
//	@Autowired
//	Engine engine;
	
	
//	public void setEngine(Engine engine) {
//		engine.type="New V8 Enginge";
//		this.engine = engine;
//	}


	
//	public Corolla(Engine engine) {
//		engine.type="New V8 Engine";
//		this.engine = engine;
//	}

	//Ex1:
//	@Autowired
//	Engine v6;
	//---
	
	
	//Ex2:
	@Autowired
	@Qualifier("V6Engine")
	Engine engine;
	//--
	@Override
	public String specs() {
		String speces = "Sedan from Toyota with engine type as "+engine.type();
		return speces;
	}

}
