package com.bext.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bext.beans.ClaseParaBean;
import com.bext.beans.Marte;
import com.bext.beans.Tierra;

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
		
		Tierra tierra = (Tierra) appContext.getBean(Tierra.class);
		System.out.println("Tierra color:" + tierra.getColor() );
		System.out.println("Tierra diametro:" + tierra.getDiametro().toString());
		
		Marte marte = (Marte) appContext.getBean("beanMarte");
		System.out.println("Marte color:" + marte.getColor());
		System.out.println("Marte diametro:" + marte.getDiametro().toString());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
