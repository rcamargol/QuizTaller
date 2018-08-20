package Modelo;

public class Mortales extends Kublakan
{
	
	private String nombre;
	private String profesion;
	private int miembros;
	
	
	public Mortales(int edad, double estatura, String colorOjos, boolean alma, String nombre) {
		super(edad, estatura, colorOjos, alma);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		profesion = " Estudiante";
		miembros = 4;
		super.planeta = "Este";
		
	}

	public void habitarPlaneta() {
		// TODO Auto-generated method stub
		System.out.println("Habito en el "+  this.planeta + "planeta" );
	}

	@Override
	public void sentir() {
		// TODO Auto-generated method stub
		System.out.println("Yo puedo sentir");
	}

	@Override
	public void habitar() {
		// TODO Auto-generated method stub
		
	}

}
