package com.bext.beans;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Value;

public class Tierra {
	@Value("AZUL")
	private String Color;
	@Value("12742")
	private BigInteger diametro;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public BigInteger getDiametro() {
		return diametro;
	}

	public void setDiametro(BigInteger diametro) {
		this.diametro = diametro;
	}
		
	
}
