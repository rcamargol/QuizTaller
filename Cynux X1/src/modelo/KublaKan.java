package modelo;

public abstract class KublaKan 
{

	protected int edad;
	
	protected int estatura;
	
	protected String colorDeOjos;
	
	protected boolean alma;
	
	public KublaKan(int edad, int estatura, String colorDeOjos, boolean alma)
	{
		
		this.edad = edad;
		
		this.estatura = estatura;
		
		this.colorDeOjos = colorDeOjos;
		
		this.alma = alma;
	}
	
	public abstract void habitar();
	
	public abstract void sentir();
	
	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	public int getEstatura() 
	{
		return estatura;
	}

	public void setEstatura(int estatura) 
	{
		this.estatura = estatura;
	}

	public String getColorDeOjos()
	{
		return colorDeOjos;
	}

	public void setColorDeOjos(String colorDeOjos) 
	{
		this.colorDeOjos = colorDeOjos;
	}

	public boolean isAlma() 
	{
		return alma;
	}

	public void setAlma(boolean alma)
	{
		this.alma = alma;
	}

}
