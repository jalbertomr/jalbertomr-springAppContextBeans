package com.bext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bext.beans.ClaseParaBean;
import com.bext.beans.Marte;
import com.bext.beans.Tierra;

@Configuration
public class AppConfig {

	@Bean
	public ClaseParaBean cpb() {
		return new ClaseParaBean();
	}
		
}
