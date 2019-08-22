package com.bext.beans;

import org.springframework.beans.factory.annotation.Value;

public class ClaseParaBean {
	
	@Value("valor asignado por @Value en clase ClaseParaBean")
	private String propiedadDeClaseMensaje;

	public String getPropiedadDeClaseMensaje() {
		return propiedadDeClaseMensaje;
	}

	public void setPropiedadDeClaseMensaje(String propiedadDeClaseMensaje) {
		this.propiedadDeClaseMensaje = propiedadDeClaseMensaje;
	}

}
