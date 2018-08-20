package modelo;

public class Heroes extends KublaKan
{	
	public Heroes(int pEdad, int pEstatura, String pAlma, String pColorOjos, String pHabitar, String pSentir) 
	{
		super(pEdad, pEstatura, pAlma, pColorOjos, pHabitar, pSentir);
		// TODO Auto-generated constructor stub
	}
	
	public void volar()
	{
		System.out.println("Yo vuelo");
	}
	
	public void crearFuego()
	{
		System.out.println("Yo creo fuego");
	}
	
	public void detenerTiempo()
	{
		System.out.println("Yo detengo tiempo");
	}
}
