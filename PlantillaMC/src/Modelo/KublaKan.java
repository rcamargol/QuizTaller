package Modelo;

public abstract class KublaKan {

	protected static String edad;

	protected static String estatura;

	protected static String colorOjos;

	protected static String alma;

	public KublaKan(String edad, String estatura, String colorOjos, String alma) {

		KublaKan.edad = edad;
		KublaKan.estatura = estatura;
		KublaKan.colorOjos = colorOjos;
		KublaKan.alma = alma;
		
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		KublaKan.edad = edad;
	}

	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		KublaKan.estatura = estatura;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		KublaKan.colorOjos = colorOjos;
	}

	public String getAlma() {
		return alma;
	}

	public void setAlma(String alma) {
		KublaKan.alma = alma;
	}

	public abstract void poderes();
	
}
