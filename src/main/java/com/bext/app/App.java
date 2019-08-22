package com.bext.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bext.beans.ClaseParaBean;

public class App {

	public static void main(String[] args) {
		System.out.println("Iniciado...");
		
		/* Metodo convencional */
/*		ClaseParaBean cpb = new ClaseParaBean();
		cpb.setSaludo("mensaje cargado");
		System.out.println(cpb.getPropiedadDeClaseMensaje());
*/
		
		/* Metodo Beans */
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/bext/xml/beans.xml");
		//ClaseParaBean cpb = (ClaseParaBean) appContext.getBean("claseBean");
		ClaseParaBean cpb = (ClaseParaBean) appContext.getBean(ClaseParaBean.class);
		System.out.println(cpb.getPropiedadDeClaseMensaje());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
