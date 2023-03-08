package com.hamo.clases;

public class PersonaP {

	public String nombre;
	public int edad;
	public PersonaP(String nombre, int edad) {
		
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "PersonaP [nombre=" + nombre + ", edad=" + edad + "]";
	} 
	
	
	
	
	
}
