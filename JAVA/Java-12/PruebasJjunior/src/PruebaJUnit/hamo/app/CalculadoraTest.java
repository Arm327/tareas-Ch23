package PruebaJUnit.hamo.app;

public class CalculadoraTest {

	

	public int sumar( int n1, int n2) {
		// TODO Auto-generated method stub

		return (n1+n2);
		
	}
	

	public int resta(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1-n2);
	}
	public double division(double d1, double d2) {
		// TODO Auto-generated method stub
return (d1 / d2);
	}
public double divisionByzero(double v1, double v2) {
if (v2 == 0) {
	throw new ArithmeticException("*** No Se Puede Dividir Por Cero");
}
return v2;
}

}


	
	

