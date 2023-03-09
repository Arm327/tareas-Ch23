package com.hamo.clases;

public abstract class FigurasGeometricas {
	public String nombre; 
	
	public FigurasGeometricas(String nombre) {		
		this.nombre = nombre;
	}
	



	public abstract double areas();
		public abstract void pedirDatos();
		



@Override
public String toString() {
	return "FigurasGeometricas [nombre=" + nombre + ", areas()=" + areas() + "]";
}
}