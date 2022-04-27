package org.study;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.study.cars.Corolla;
import org.study.cars.Swift;
import org.study.specs.V6;
import org.study.specs.V8;

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
	
	@Bean("V8Engine")
	public V8 v8() {
		return new V8();
	}
	
	@Bean("V6Engine")
	public V6 v6() {
		return new V6();
	}
}
 