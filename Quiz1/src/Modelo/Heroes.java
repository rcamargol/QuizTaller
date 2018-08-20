package Modelo;

public class Heroes extends Kublakan
{
	
	public String nombre;
	
	
	public Heroes(int edad, double estatura, String colorOjos, boolean alma, String nombre) {
		
		super(edad, estatura, colorOjos, alma);
		this.nombre = nombre;
		super.planeta = "norte";
		super.sentir = "sentir";
	}

	
	
	@Override
	public void habitarPlaneta() {
		// TODO Auto-generated method stub
		System.out.println("habito en el  " + super.planeta + " del planeta");
	}

	@Override
	public void sentir() {
		// TODO Auto-generated method stub
		System.out.println("Tengo la capacidad de " + this.sentir + " y a otros seres");
	}
	
	public void dones()
	{
		System.out.println("Puedo volar por los aires");
		System.out.println("Puedo crear fuego con las manos");
		System.out.println("Puedo detener el tiempo");
		
	}



	@Override
	public void habitar() {
		// TODO Auto-generated method stub
		
	}
}
