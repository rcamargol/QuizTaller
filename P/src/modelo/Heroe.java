package modelo;

public class Heroe extends KublaKan
{

	private static final String LUGAR_HABITAD = "Norte";
	
	public Heroe(int edad, double estatura, String colorOjos, boolean alma) 
	{
		super(edad, estatura, colorOjos, alma);
		estatura = 3.00;
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
