package org20210809;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AnnoConf {
	
	@Bean
	public A a() {
		A a = new A(10);
		a.setAa(100);
		return a;
	}
	
	@Bean
	public B b() {
		B b= new B(a());
		return b;
	}

}
