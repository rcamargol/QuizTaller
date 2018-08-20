package Modelo;

public abstract class Desterrado extends KublaKan {

	public Desterrado(String nombre, int edad, double estatura, String colorOjos, String alma) {
		super(nombre, edad, estatura, colorOjos, alma);
		// TODO Auto-generated constructor stub
	}
	
	public void desterrado() {
		System.out.println("Hola, soy"+super.nombre);
	}
	
	
	

}
