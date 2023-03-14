package PruebaJUnit.hamo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import PruebaJUnit.hamo.app.CalculadoraTest;



class Calculadora {
	public PruebaJUnit.hamo.app.CalculadoraTest ct;
	public CalculadoraTest ct1;

	@BeforeEach
	public void configurandoBefore() {
	ct1 = new CalculadoraTest();	
	System.out.println("Ejecutando Before ---> ");

	}
	
	@AfterEach
	public void configurandoAfter() {
	ct = null;
		System.out.println("Ejecutando AfterEach() ---> configurandoAfter()");
		System.out.println("--------------***********-------------------");
	}
	

	@Test
	public void calculadoraNull() {
	
		assertNotNull(ct, "La Clase es una Instancia no Nula");
		System.out.println("ejecutando el Primer Test ---> Calculadora");
	}
	

	@Test
	public void calculadoraNotNull() {
		assertNotNull(ct, "La Clase esta Instanciada");
		System.out.println("Ejecutando segundo Test ---> Calculadora");
	}

	@Test
	public void primeroAssert() {
		// TODO Auto-generated method stub

		/*¨
		 * 
		 * 1- indicar que se va a evaluar
		 * 2- indicar lo que se va a realizar
		 * 3- evaluar con el assert indicado
		 * 
		 * 
		 */
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(7, 3);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando Tercer Test ---> primerosAssert()");
		}
	
	public void sumaTest() {
		// TODO Auto-generated method stub
		Calculadora calculadora =new Calculadora();
assertEquals(20,ct.sumar(10,10));
System.out.println("Ejecutando cuarto Test ---> primerosAssert()");

	}
	/*********************TIPOS DE TEST*************************/
	@Test
	public void tiposAsserts() {
		// TODO Auto-generated method stub
assertTrue(1 == 1);
assertEquals("Generation", "Generation");
	assertNull(ct1);
	Calculadora c1 = new Calculadora();
	Calculadora c2 = new Calculadora();
	Calculadora c3 = c1;
	assertSame(c1, c3);
	assertNotSame(c1, c3);
	assertEquals(1,1,.2,.5);
	}
	@Test
	
	public void validandosuma() {
		
		assertEquals(11, ct.sumar(5, 6));
	}
	@Test
	public void validandoresta() {
		assertEquals(50, ct.resta(56, 6));
	}
	@Test
	public void validandoRestaNegativa() {
		// TODO Auto-generated method stub
		assertEquals(-10, ct.resta(1, 20));
	}
	public void validandoDivision(double d1, double d2) {
	assertEquals(2, ct.division(10, 5));
	
	}
	
	@Test
	public void validandoByZero() {
		assertThrows(ArithmeticException.class, 
		()->ct.divisionByzero(10, 0),"***no se puede divir por Cero");

	}
}



