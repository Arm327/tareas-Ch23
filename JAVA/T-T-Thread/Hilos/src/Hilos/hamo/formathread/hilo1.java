package Hilos.hamo.formathread;

public class hilo1 extends Thread {

	public hilo1(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Se Inicia El Thread o Hilo " + this.getName());
		for (int i = 0; i < 10; i++)
			;
		{

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Termina El Hilo o Thread " + this.getName());

	}
}
