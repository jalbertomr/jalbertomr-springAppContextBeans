package com.bext.beans;

public class Persona {
	private int id;
	private String nombre;
	private String telefono;
	private Pais pais;
	private Ciudad ciudad;
	
	public int getId() { return id; }
	public void setId(int id) {	this.id = id; }

	public String getNombre() {	return nombre;}
	public void setNombre(String nombre) { this.nombre = nombre;}

	public String getTelefono() { return telefono; }
	public void setTelefono(String telefono) { this.telefono = telefono; }

	public Pais getPais() {	return pais;}
	public void setPais(Pais pais) {this.pais = pais;}
	
	public Ciudad getCiudad() {	return ciudad;}
	public void setCiudad(Ciudad ciudad) {	this.ciudad = ciudad;}
}
