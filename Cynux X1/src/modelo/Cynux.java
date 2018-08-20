package modelo;

public class Cynux 
{

	private Heroes[] heroe;
	private Desterrados desterrado;
	private Mortales[] mortal;
	
	private Persistencia persitencia;
	
	
	public Cynux()
	{
		
	}
	
	public void crearHeroe()
	{
		for (int i = 0; i < heroe.length; i++) 
		{
			if(heroe[i] == null)
			{
				heroe[i] = new Heroes(sedad, persitencia.ESTATURA_HEROES);
			}
		}
	}
	
}
