package modelo;

public class Desterrado extends KublaKan
{

	private static final String LUGAR_HABITAD = "Sur";
	
	public Desterrado(int edad, double estatura, String colorOjos, boolean alma) 
	{
		super(edad, estatura, colorOjos, alma);
	}

	public void verificarEdad(int edad)
	{
		if(edad > 1500)
		{
			System.out.println("La edad NO es válida");
			edad = 0;
		}
	}
	
	@Override
	public String habitar() 
	{
		return LUGAR_HABITAD;
	}

	@Override
	public void sentir() 
	{

	}

	@Override
	public void volar() 
	{
	
		
	}

	@Override
	public void crearFuego() 
	{

	}

	@Override
	public void detenerTiempo() 
	{

	}
	
}
