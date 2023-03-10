package Hilos.hamo.pruebas;

import Hilos.hamo.formarunnable.Hilo2;

public class TestRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo2 ht = new Hilo2("Caligula");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Caligula")).start();
		new Thread(new Hilo2("Mariano")).start();
		
	}

}
