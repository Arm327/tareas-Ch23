package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	
	public void controlIf() {
		// TODO Auto-generated method stub
		
		
		/*
		if (condition) {
			
		}
		*/
		
		/*
		long 
		int Integer
		float Float
		char 
		String  
		double
		*/
		
		long nota = 5;
		if (nota > 5) {
		 System.out.println("Calificación Aprobatoria");
		} 
		System.out.println("Continua el control...");
		
		
		
		
		
		/*
		if (condition) {
		} else {
		
		}
		*/
		
		if (nota >= 5) {
			System.out.println("nota aprobatoria " + nota);
			
		} else {
			System.out.println("nota no aprobatoria " + nota);
		}
		System.out.println("continua el control...");
		
	}
		
		public void divisible() {
			// TODO Auto-generated method stub
			System.out.println("Introduzca un Primer Numero: ");
			int dato1 = entrada.nextInt();
			System.out.println("Introduzca un Segundo Numero: ");
			int dato2 = entrada.nextInt();
			if (dato1 % dato2 == 0) {
				System.out.println(dato1 + " es divisible entre " + dato2);
			}else {
				System.out.println(dato1 + " no es divisible " + dato2);
			}
		}
			
			
			
			public void compara() {
				// TODO Auto-generated method stub
			System.out.println("introduzca un numero");
			int valor1 = entrada.nextInt();
			System.out.println("introduzca un numero");
			int valor2 = entrada.nextInt();
			if (valor1 > valor2) {
				System.out.println(valor1 + " es mayor que " + valor2);
			}else {
				System.out.println(valor1 + " es menor que "+ valor2);
			}
			}
			
			
			
			
			public void anidado() {
				// TODO Auto-generated method stub
			/*
				if (condition) {
					
				}else if (condition) {
					
				} else {
				
				
			
			}*/
				System.out.println("introduzca un 1er numero");
				int mayor1 = entrada.nextInt();
				if (mayor1 > 0) {
					System.out.println("el numero es positivo "+ mayor1);
				}else if (mayor1 < 0) {
					System.out.println(mayor1 + " es negativo");
				}
				else {
					System.out.println("*** numero igual a 0 ***");
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}
	




