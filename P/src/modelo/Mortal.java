package modelo;

public class Mortal extends KublaKan
{

	private static final String LUGAR_HABITAD = "Este";
	
	public Mortal(int edad, double estatura, String colorOjos, boolean alma) 
	{
		super(edad, estatura, colorOjos, alma);
		colorOjos = "Violeta";
	}

	@Override
	public String habitar() 
	{
		return LUGAR_HABITAD;
	}

	@Override
	public void sentir() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volar() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearFuego() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detenerTiempo() 
	{
		// TODO Auto-generated method stub
		
	}
}
