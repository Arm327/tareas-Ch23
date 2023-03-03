package ciclos.forwhiledo;

public class UsoFor {
	public void cicloFor() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("el iterador --> " + i);
		}

	}
	
	public void letrasfor() {
		System.out.println("For Con Letras");
		for (int i = 'A'; i < 'Z'; i++) { 
			System.out.print("Soy --> " + i + ", ");
			char letra = (char) i;
			System.out.println();
			System.out.print("Soy ---> " + letra + ", ");
		}

	}
	
	
}
