package com.hamo.clases;

public class AlumnoB extends PersonaP{

	public int matricula;
	public double promedio;
	
	
	
	
	public AlumnoB(int matricula, double promedio, String nombre, int edad){
		super( nombre, edad);
		this.matricula = matricula;
		this.promedio = promedio;
		
		
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	
	@Override
	public String toString() {
		return "AlumnoB [matricula=" + matricula + ", promedio=" + promedio + "]";
	}
	
	
	public void mostradDatos() {
		// TODO Auto-generated method stub
		System.out.println(this.getNombre()+" "+this.getEdad()+" "+this.getMatricula()+" "+this.promedio);


	}
	
	public void mostrarDatos(String apellido) {
		System.out.println(this.getNombre()+" "+apellido+" "+this.getEdad()+" "+this.getMatricula()+" "+this.promedio);

		System.out.println(this.getNombre()+" "+this.getEdad()+" "+this.getMatricula()+" "+this.promedio);

	}
	
	
	
}
