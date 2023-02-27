package clases;

import java.util.Scanner;

public class NuevoHola {
	Scanner sn = new Scanner(System.in);

	
	 String nombre;

	public NuevoHola(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void saludo() {
	System.out.print("Hola desde java con sts de nuevo " + this.nombre);
}
	
	public void saludoConNombre() {
		System.out.println("cual es tu nombre: " + this.nombre);
		
	}
	
	
	
	
	}
	
	
	
}
