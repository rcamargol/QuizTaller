package Modelo;

public abstract class Kublakan
{

	protected int edad;
	protected double estatura;
	protected String colorDeOjos;
	protected String alma;
	
	
	public Kublakan(int Pedad, double Pestatura, String Pcolordeojos, String Palma)
	{
		edad = Pedad;
		estatura  = Pestatura;
		colorDeOjos =  Pcolordeojos;
		alma = Palma;
		
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

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public String getColorDeOjos() {
		return colorDeOjos;
	}

	public void setColorDeOjos(String colorDeOjos) {
		this.colorDeOjos = colorDeOjos;
	}

	public String getAlma() {
		return alma;
	}

	public void setAlma(String alma) {
		this.alma = alma;
	}

	public void dones(String pDon) 
	{
		System.out.println("Los dones de este ser: "+ pDon);
		
	}
	
	public void sentir(String pSentir)
	{
		System.out.println("Este ser se llama"+ pSentir);
		
	}
}
