package oop.clases;

public class persona {
	public String nombre = "Godwyn";
	public int edad;
	public String altura; 
	public double peso;
	public String zodiaco; 
	
	
	
	public String getnombre( ) {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getedad( ) {
		return edad;
	}
	public void setedad(int edad) {
		this.edad = edad;
	}
	
	
	public String getaltura( ) {
		return altura;
	}
	public void setaltura(String altura) {
		this.altura = altura;
	}
	
	
	
	public persona(int edad, String zodiaco) {
		super();
		this.edad = edad;
		this.zodiaco = zodiaco;
	}
	
	
	public persona(String nombre, int edad, String altura, double peso, String zodiaco) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.zodiaco = zodiaco;
	}
	public void Persona01(String nombre) {
		this.nombre = nombre;
	}
	public String datosPersona() {
		
		return this.nombre = nombre + "" + this.edad +""+this.altura+ "" + this.peso+ "" +this.zodiaco;
	}
	
	
	
	
}
							