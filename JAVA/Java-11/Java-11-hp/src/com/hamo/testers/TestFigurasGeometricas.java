package com.hamo.testers;

import com.hamo.clases.*;

public class TestFigurasGeometricas {
	
	public static void main (String[] args) {
		
	FigurasGeometricas rectangulo = new Rectangulo(10,2);
	FigurasGeometricas circulo = new Circulo(2);
	FigurasGeometricas cuadrado = new Cuadrado(4, 4);
	FigurasGeometricas rombo = new Rombo(8, 6);

	
	
	
	
	System.out.println(rectangulo.areas());
	System.out.println(circulo.areas());
	System.out.println(cuadrado.areas());
	System.out.println(rombo.areas());
	
	System.out.println(rectangulo.toString());
	System.out.println(circulo.toString());
	System.out.println(rombo.toString());
	System.out.println(cuadrado.toString());
	
	
	
	
	rectangulo.pedirDatos();
	System.out.println(rectangulo.toString());
	System.out.println(rectangulo.areas());
	
	}

	
	
}
