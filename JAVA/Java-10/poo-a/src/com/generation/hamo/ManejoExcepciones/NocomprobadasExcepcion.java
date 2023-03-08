package com.generation.hamo.ManejoExcepciones;

import java.util.Scanner;

public class NocomprobadasExcepcion {
 public static void main(String[] args) {
Scanner dato = new Scanner(System.in);
	 System.out.println("Introduzca un Valor: ");
	 int divisor;
	 
	
	 
	 
	 try {
		 divisor = Integer.parseInt(dato.next());
		 int division = 10/divisor;
			System.out.println("--->" + division);
		
	 }catch(ArithmeticException e){
		 System.out.println("Capturando la Excepción " + e.getMessage());
	 }catch (NumberFormatException nfe) {
		 System.out.println("El Dato es un Caracter" + nfe.getMessage());
	 }finally 
		 {
		 System.out.println("Este Bloque es opcional y se va a ejecutar con o sin la exception");
	 }
	 
	 System.out.println("continuamos con el flujo de la aplicación");
	 
	
}
}