package com.bext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bext.beans.Marte;
import com.bext.beans.Tierra;

@Configuration
public class AppConfig2 {
	
	@Bean
	public Tierra tierra() {
		return new Tierra();
	}
	
	@Bean(name = "beanMarte")
	public Marte marte() {
		return new Marte();
	}
}
