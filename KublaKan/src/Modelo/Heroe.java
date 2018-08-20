package Modelo;

public abstract class Heroe extends KublaKan  {
	
	private String poder;

	public Heroe(String nombre, int edad, double estatura, String colorOjos, String alma, String poder) {
		super(nombre, edad, estatura, colorOjos, alma);
		this.poder = poder;
	}
	
	

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	
    public void heroe() {
		
		System.out.println("Hola, soy "+super.nombre+"\ntengo "+super.edad+" años"+"\nmido "+super.estatura+" metros"+"\nmis ojos son de color "+super.ColorOjos+"\ny "+this.poder+"\n	" );
		
	}

}
