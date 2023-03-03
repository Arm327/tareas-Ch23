package control;

import java.util.Scanner;

public class EstructuraMultiple {

	Scanner dato = new Scanner(System.in);

	public void vocal() {
		// TODO Auto-generated method stub
		System.out.println("Introduce una letra");
		char letra = dato.next().charAt(0);
		switch (letra) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(" es Vocal ");
			break;

		default:
			System.out.println(" El caracter no es vocal " + letra);
			break;
		}
	}

	public void calificaciones() {
		// TODO Auto-generated method stub
		System.out.println("Introduce calificación: ");
		int nota = dato.nextInt();
		switch (nota) {
		case 10:
			System.out.println("supera las expectativas");
			break;
		case 9:
			System.out.println("excelente");
			break;
		case 8:
			System.out.println("sera mejor la proxima");
			break;
		case 7:
			System.out.println("apenas pasable");
			break;
		case 6:
			System.out.println("deberas esforzarte mas");
			break;
		case 5:
			System.out.println("lo intentaste");
			break;
		case 4:
			System.out.println("No lo intentaste");
			break;
		case 3:
			System.out.println("no te esforzaste");
			break;
		case 2:
			System.out.println("que haces aqui?");
			break;
		case 1:
			System.out.println("mediocre");
			break;
		case 0:
			System.out.println("no perteneces aqui");

			break;

		default:
			System.out.println("Fuera de rango");
			break;
		}
	}

	/*
	 * ?: Operador Elvis variable = (PL) ? entrada verdad : entrada falso
	 * 
	 */

	public void ternario() {
			// TODO Auto-generated method stub
			System.out.println("Introduzca un valor numerico: ");
			int entradaV = dato.nextInt();
			System.out.println("Introduzca un segundo valor numerico: ");
			int entradaF = dato.nextInt();
			int menor = (entradaV <= entradaF) ? entradaV : entradaF;
			System.out.println("---------->" + menor);
					
					
					
	}

}
