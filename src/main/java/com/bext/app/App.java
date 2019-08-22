package com.bext.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bext.beans.ClaseParaBean;
import com.bext.beans.Marte;
import com.bext.beans.Tierra;
import com.bext.config.AppConfig;
import com.bext.config.AppConfig2;

public class App {

	public static void main(String[] args) {
		System.out.println("Iniciado...");
		
		/* Metodo convencional */
/*		ClaseParaBean cpb = new ClaseParaBean();
		cpb.setSaludo("mensaje cargado");
		System.out.println(cpb.getPropiedadDeClaseMensaje());
*/
		
		/* Metodo Beans */
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/bext/xml/beans.xml");
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
		//appContext.refresh();
		//ClaseParaBean cpb = (ClaseParaBean) appContext.getBean("claseBean");
		ClaseParaBean cpb = (ClaseParaBean) appContext.getBean(ClaseParaBean.class);
		System.out.println("ClaseParaBean.getPropiedadDeClaseMensaje:" + cpb.getPropiedadDeClaseMensaje());
		
		Tierra tierra = (Tierra) appContext.getBean(Tierra.class);
		System.out.println("Tierra color:" + tierra.getColor() );
		System.out.println("Tierra diametro:" + tierra.getDiametro().toString());
		
		Marte marte = (Marte) appContext.getBean("beanMarte");
		System.out.println("Marte color:" + marte.getColor());
		System.out.println("Marte diametro:" + marte.getDiametro().toString());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
