package com.hamo.testers;

import com.hamo.clases.OperacionesAritmeticas;
import com.hamo.clases.Suma;
import com.hamo.clases.Mensajes;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s = new Suma (5, 3);
	OperacionesAritmeticas ss = new Suma(10,5);
	Mensajes sss = new Suma();
	
	System.out.println("Suma "+s.sumar());
	System.out.println("Operaciones Aritmeticas "+ss.sumar());
	s.mensaje();
	sss.mensaje();
	
	}

}
