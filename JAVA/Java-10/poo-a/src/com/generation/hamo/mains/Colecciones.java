package com.generation.hamo.mains;

import java.util.*;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> coleccion = new ArrayList <String>();
		coleccion.add("Colecciones");
		coleccion.add("cohorte23");
		
		/*
		coleccion.add(13);
		coleccion.add(15,15);
		coleccion.add('a');
		*/
		for (int i = 0; i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i));
		}
	}

}
