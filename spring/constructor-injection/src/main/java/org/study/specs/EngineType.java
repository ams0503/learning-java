package org.study.specs;

import org.study.interfaces.Engine;
import org.springframework.stereotype.Component;

public class EngineType implements Engine {
	String type;
		
	public EngineType() {
		type = "unknown";
	}

	public EngineType(String type) {
		this.type = type;
	}

	@Override
	public String type() { 
		return type;
	}
}
