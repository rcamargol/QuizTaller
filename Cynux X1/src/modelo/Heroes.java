package modelo;

public class Heroes extends KublaKan
{
	
	private Persistencia persistencia;
	
	public Heroes(int edad, int estatura, String colorDeOjos, boolean alma)
	{	
		super(edad, estatura, colorDeOjos, alma);
			
	}


	public void habitar() 
	{
		System.out.println("Yo habito en " + persistencia.HABITAD_HEROES);
	}

	public void sentir() 
	{
		System.out.println("Yo siento " + persistencia.SENTIR_HEROES);	
	}

	
	public void volar()
	{
		System.out.println("Yo puedo volra por los aires");
	}
	
	public void crearFuego()
	{
		System.out.println("Puedo crear fuego con mis manos");
	}
	
	public void detenerElTiempo()
	{
		System.out.println("Puedo detener el tiempo, detendre el programa 5 segundos");
		try 
		{
			Thread.sleep(5000);
			System.out.println("Listo");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
