package Modelo;

public abstract class KublaKan {
	
	protected String nombre;
	protected int edad;
	protected double estatura;
	protected String ColorOjos;
	protected String alma;
	
	
	public KublaKan(String nombre,int edad, double estatura, String colorOjos, String alma) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		ColorOjos = colorOjos;
		this.alma = alma;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getEstatura() {
		return estatura;
	}


	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}


	public String getColorOjos() {
		return ColorOjos;
	}


	public void setColorOjos(String colorOjos) {
		ColorOjos = colorOjos;
	}


	public String getAlma() {
		return alma;
	}


	public void setAlma(String alma) {
		this.alma = alma;
	}
	

	
	

}
