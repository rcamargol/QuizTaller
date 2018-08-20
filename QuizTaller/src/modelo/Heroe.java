package modelo;

public class Heroe extends KublaKan
{
	
	
	public Heroe(int pEdad, String pColorOjos, double pEstatura)
	{
		super(pEdad, pColorOjos, pEstatura);
	}
	
	public void volar()
	{
		System.out.println("volando con boxer");
	}
	
	public void crearFuego()
	{
		System.out.println(" Lanzo bolas de fuego plasma");
	}
	
	public void detenerTiempo()
	{
		System.out.println("Dentengo el tiempo cunado me lo chuchu");	
	}

	public void habitar() 
	{
		System.out.println("Norte del planeta Cynus X1.");
	}

	public void sentir() 
	{
		System.out.println("A si mismo y a seres de otros mundos ");
	}
}
