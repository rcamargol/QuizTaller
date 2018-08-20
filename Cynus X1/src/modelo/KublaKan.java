package modelo;

public abstract 
class KublaKan 
{
	protected int edad;
	protected int estatura;
	protected String alma;
	protected String colorOjos;
	protected String habitar;
	protected String sentir;
	
	public KublaKan( int pEdad, int pEstatura, String pAlma, String pColorOjos, String pHabitar, String pSentir)
	{
		this.edad = pEdad;
		this.alma = pAlma;
		this.colorOjos = pColorOjos;
		this.estatura = pEstatura;
		this.habitar = pHabitar;
		this.sentir = pSentir;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public String getAlma() {
		return alma;
	}

	public void setAlma(String alma) {
		this.alma = alma;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	
	
}
