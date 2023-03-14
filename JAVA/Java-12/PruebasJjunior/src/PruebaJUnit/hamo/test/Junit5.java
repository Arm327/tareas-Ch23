package PruebaJUnit.hamo.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import PruebaJUnit.hamo.app.Calculadora;

class CalculadoraTest {

	 private Calculadora ct = null;
	@Test
	public void calculadoraNull() {
assertNotNull(ct, "La Clase es una Instancia no Nula");	
System.out.println("ejecutando el Primer Test ---> Calculadora");
	}

	
	
	
}
