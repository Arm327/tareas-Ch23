package colecciones.hamo;

import java.util.*;

public class Miscolecciones {

	public static void main(String[] args) {
		Miscolecciones c = new Miscolecciones();
		
		Map miMap;
		//imprimir(c.listasColecciones());
		 mapCollection(miMap.values());

		wrapperclass();

	}

	Set setCollections() {
		Set miSet = new HashSet();
		
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.clear();
		miSet.add("cuatro");
		miSet.add("dos");
		miSet.add("cinco");
		miSet.isEmpty();
		miSet.add("cuatro");
		miSet.add("dos");
		miSet.add("cinco");
		miSet.toArray();
		
		return miSet; 
	}

	public List listasColecciones() {

		List miLista = new ArrayList();
		System.out.println(miLista + " Tamaño de la Lista " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());

		miLista.add("1");
		miLista.add(0, 2);
		miLista.add(3);
		miLista.add(0, "pato");

		miLista.set(0, miLista);
		miLista.remove(0);

		System.out.println(miLista + " Tamaño de la Lista Despues " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());

		boolean e = miLista.contains(2);
		System.out.println("--->" + e);
		return miLista;

	}

	public static void imprimir(Map collection) {
		// TODO Auto-generated method stub
		for (Object elementos : c) {

			System.out.println("Elementos " + elementos);
		}
	}
	
	
	
	
	
	
	public Map mapCollection() {
		Map miMap = new HashMap();
		
		
		miMap.put("Valor1", "Juan");
		miMap.put("Valor2", "Maria");
		miMap.put("Valor3", "Arturo");
		miMap.put("Valor4", "Karla");
		
		miMap.remove("Valor2");
		imprimir(miMap.keySet());
		imprimir(miMap.values());
		//miMap.clear();
		
		return miMap;
	
	
	
	
	}
	
	
	
	
	
	

	public static void wrapperclass() {
		// byte, short, char, long, float, int, double, boolean

		byte numeroB = -128;
		System.out.println("Tamaño de un byte" + Byte.SIZE);
		System.out.println("Valor Maximo " + Byte.MAX_VALUE);
		System.out.println("Valor Minimo " + Byte.MIN_VALUE);
		System.out.println("---->" + numeroB);

		int numero1 = 2147483647;
		System.out.println("Tamaño de un Entero en bytes: " + Integer.SIZE);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor Maximo " + Integer.MAX_VALUE);
		System.out.println("Valor Minimo " + Integer.MIN_VALUE);
		System.out.println("--->" + numero1);

		int numero2 = 16;
		System.out.println("Tamaño de un Entero en bytes: " + Integer.SIZE);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor Maximo " + Integer.MAX_VALUE);
		System.out.println("Valor Minimo " + Integer.MIN_VALUE);
		System.out.println("--->" + numero2);

		int numero3 = 2147483647;
		System.out.println("Tamaño de un Entero en bytes: " + Integer.BYTES);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor Maximo " + Integer.MAX_VALUE);
		System.out.println("Valor Minimo " + Integer.MIN_VALUE);
		System.out.println("--->" + numero3);

		int numero4 = 64;
		System.out.println("Tamaño de un Entero en bytes: " + Integer.BYTES);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor Maximo " + Integer.MAX_VALUE);
		System.out.println("Valor Minimo " + Integer.MIN_VALUE);
		System.out.println("--->" + numero4);
	}

}
