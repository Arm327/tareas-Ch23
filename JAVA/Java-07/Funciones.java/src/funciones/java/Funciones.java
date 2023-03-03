package funciones.java;

import java.lang.Scanner;

public class Funciones { //clase llamada funciones
	
	
	
	//las funciones se pueden declarar en cualquier lugar de la clase
	public static int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado; 

	}//cierre de sumar
	
	
//Funcion para imprimir asteriscos
	private static void imprimirasteriscos() {
		System.out.println("******************************************");

	}//cierre de asteristicos
	
	
	//funcion que combina distintos tipos de valores 
	
	public static float sumadecimal(float valor1, float f) {
	float	resultadodecimal  = valor1 + f;
		return resultadodecimal;
	}
	
	//funcion que usa Strings como argumentos 
	public static String aguadelimon(String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3; 
		return recetaCompletada; 
		

	}
	
	
	
// este metodo tiene como funcion, ejecutar cosas
	public static void main(String[] args) { 
		// las invocaciones de la funcion se hacen generalmente dentro del metodo principal o main 
		
		System.out.println("el resultado de la suma es: " + sumar(5,8));
		
		
		imprimirasteriscos();
		
	System.out.println("el resultado de la suma decimal es: " + sumadecimal (5, 5.7f));
	
	
	System.out.println("Estos son los pasos para preparar agua de limon: "+aguadelimon("agua", "limon","azucar"));

	
	//	-funciones de la biblioteca de matematicas (math)
	
	
double valorejemplo = 7.65497834d;
	System.out.println("La raiz cuadrada de mi valor es : " + Math.sqrt(valorejemplo));
	
	static double sqrt(double a) {
		
	}
		//codigo para calcular la raiz cuadrada
	
	
	

	
	

	//cierre de metodo main
	
//cierre de funciones
/*
 * FUNCIONES 
 * 
 * -No retonan valores: no devuelven nada, no especifican y no usamos la palabra return.
 * -Si retonan valores: se especifica el tipo de dato, el tipo de valor que regresa y se usa return para esto. 
 * 
 - Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     }
 * 
 * 
 * 
 */

