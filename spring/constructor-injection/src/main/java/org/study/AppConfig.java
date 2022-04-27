package org.study;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.study.cars.Corolla;
import org.study.cars.Swift;
import org.study.specs.EngineType;


@Configuration
@ComponentScan("org.study")
public class AppConfig {
	
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8 engine");
	}
}
 