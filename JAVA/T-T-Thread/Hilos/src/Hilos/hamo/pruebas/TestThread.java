package Hilos.hamo.pruebas;

import Hilos.hamo.formathread.hilo1;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread h = new hilo1("Joffrey");
		h.start();
		Thread h0 = new hilo1("Cercei");
		h0.start();
		Thread h1 = new hilo1 ("Jaime");
		h1.start();
		
		h.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(h.getState());
	}

}
