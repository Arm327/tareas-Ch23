package com.hamo.clases;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas{
public double base;
public double altura;



public Rectangulo(double base, double altura) {
	super("Rectangulo");
	this.base = base;
	this.altura = altura;
}




	@Override
public double areas() {
    // TODO Auto-generated method stub
    return base*altura;
}
	
	public double getbase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
public void setaAltura(double altura) {
	// TODO Auto-generated method stub
	this.altura = altura;

}




@Override
public void pedirDatos() {
	// TODO Auto-generated method stub
	Scanner datos = new Scanner (System.in);
	System.out.print("Introduzca la base: ");
	
	
	double b = datos.nextDouble();
	this.setBase(b);
	
	
	System.out.print("Introduzca la Altura: ");
	this.setaAltura(datos.nextDouble());
	
}

}
