package com.hamo.clases;

import com.hamo.clases.FigurasGeometricas;

public class Rombo extends FigurasGeometricas{
public double base;
public double altura;



public Rombo(double base, double altura) {
	super("Rombo");
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
	
}

}