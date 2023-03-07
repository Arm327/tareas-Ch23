package com.generation.hamo.mains;

import com.generation.hamo.clases.AreaPerimetro;
import com.generation.hamo.clases.FigurasGeometricas;

public class TestAreaPerimetro {
	public static void main(String[] args) {
		AreaPerimetro ap= new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		fg.setArea(ap.area(5));
		System.out.println("Area Cuadrado---> "+ fg.getArea());

	}

}
