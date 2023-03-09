package com.hamo.clases;

public class Suma implements OperacionesAritmeticas, Mensajes{
	public double alfa;
	public double beta;
	
	

	public Suma() {
		
	}

	public Suma(double alfa, double beta) {
		super();
		this.alfa = alfa;
		this.beta = beta;
	}

	@Override
	public double sumar() {
		
		return this.alfa + this.beta;
	}
	
	
	
	

	@Override
	public double restar() {
		
		return 0;
	}

	@Override
	public double multi() {
		
		return 0;
	}

	@Override
	public double divi() {
		
		return 0;
	}

	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		System.out.println("Hola Soy Una Suma. ");
	}

}
