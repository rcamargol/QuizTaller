package modelo;

public abstract class KublaKan 
{
	protected String colorOjos;
	protected int edad;
	protected double estatura;
	
	public KublaKan(int pEdad, String pColorOjos, double pEstatura)
	{
		estatura = pEstatura;
		edad = pEdad;
		colorOjos = pColorOjos;
	}

	public String getColorOjos() 
	{
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) 
	{
		this.colorOjos = colorOjos;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	public double getEstatura() 
	{
		return estatura;
	}

	public void setEstatura(double estatura) 
	{
		this.estatura = estatura;
	}
	
	public abstract void habitar();
	public abstract void sentir();
}
