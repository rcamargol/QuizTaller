package Modelo;

public abstract class Mortal extends KublaKan{
	
	private String profesion;
	private String conocimiento;
	private String familia;
	
	public Mortal(String nombre, int edad, double estatura, String colorOjos, String alma, String profesion,
			String conocimiento, String familia) {
		
		super(nombre, edad, estatura, colorOjos, alma);
		this.profesion = profesion;
		this.conocimiento = conocimiento;
		this.familia = familia;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getConocimiento() {
		return conocimiento;
	}

	public void setConocimiento(String conocimiento) {
		this.conocimiento = conocimiento;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	public void mortal() {
		System.out.println("Hola, soy "+ super.nombre+"\ntengo "+super.edad+" años"+"\ny soy"+this.profesion);
	}

}
