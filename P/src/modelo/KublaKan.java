package modelo;

public abstract class KublaKan 
{
	protected int edad;
	protected double estatura;
	protected String colorOjos;
	protected boolean alma;
	
	public KublaKan(int edad, double estatura, String colorOjos, boolean alma)
	{
		
	}
	
	//--------------Métodos abstractos--------------//
	
	public abstract String habitar();
	public abstract void sentir();
	public abstract void volar();
	public abstract void crearFuego();
	public abstract void detenerTiempo();
	//public abstract void adquirirConocimientos();
	
	
	//--------------Getters 'n' Setters--------------//
	
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
	public String getColorOjos() 
	{
		return colorOjos;
	}
	public void setColorOjos(String colorOjos) 
	{
		this.colorOjos = colorOjos;
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
