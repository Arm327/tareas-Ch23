
package clases;

import clases.Holajava; 

class EjecutarHolaJava {

	public static void main(String[] hector) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		NuevoHola nh = new NuevoHola("Hector Meneses");
		nh.saludo();
		String nombre;
		System.out.print("Cual es tu nombre; ");
		nombre = sn.next();
		
		nuevohola nh1 = new nuevohola(nombre);
		
		Holajava objHJ;
		objHJ = new Holajava();
		objHJ.saludo();
		
		Holajava objHJ1 = new Holajava();
		objHJ1.saludo();
	}

}
