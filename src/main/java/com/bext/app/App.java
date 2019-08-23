package com.bext.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bext.beans.Ciudad;
import com.bext.beans.Persona;
import com.bext.config.AppConfig;
import com.bext.config.AppConfig2;

public class App {

	public static void main(String[] args) {
		System.out.println("Iniciado...");
		
		/* Metodo Beans */
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/bext/xml/beans.xml");
		//AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		//appContext.register(AppConfig.class);
		//appContext.register(AppConfig2.class);
		//appContext.refresh();
		
		Persona per = (Persona) appContext.getBean("personaAlias2");
		System.out.println(per.getId() + " " + per.getNombre() +" "+per.getTelefono() + " "+ per.getPais().getNombre());

		for (Ciudad ciudad:  per.getPais().getCiudades()) {
			System.out.println(ciudad.getNombre());
		}
		
		((ConfigurableApplicationContext)appContext).close();
	}
}
