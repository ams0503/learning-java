package org.study.specs;

import org.study.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component
public class V6 implements Engine {

	@Override
	public String type() {
		
		return "V6 Engine";
	}

}
