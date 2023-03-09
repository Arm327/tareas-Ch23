package com.hamo.clases;

public class TestPB {

	
	public static void main (String[] args) {
		AlumnoB a = new AlumnoB(123, 8.5, "Armando", 20);
		PersonaP b = new PersonaP ("Maria",18);
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.getMatricula());
		System.out.println(a.getEdad());
		System.out.println(a.toString());
		System.out.println(b.toString());
		a.mostradDatos();
		a.mostrarDatos("Lara");
	
	}
}