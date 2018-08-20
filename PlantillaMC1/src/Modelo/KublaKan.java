package Modelo;

public abstract class KublaKan {

	protected String nombre;
	protected int edad;
	protected double estatura;
	protected String colorOjos;
	protected boolean alma;

	protected String ubicacion;
	protected String sentido;

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
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public boolean isAlma() {
		return alma;
	}

	public void setAlma(boolean alma) {
		this.alma = alma;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getSentido() {
		return sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}

	public void habitar(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void sentir(String sentido) {
		this.sentido = sentido;
	}

}
