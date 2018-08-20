package modelo;

public class Desterrados extends KublaKan
{

	private Persistencia persistencia;
	
	public Desterrados(int edad, int estatura, String colorDeOjos, boolean alma)
	{
		
		super(edad, estatura, colorDeOjos, alma);
		
		persistencia = new Persistencia();
		
	}

	public void habitar() 
	{
		System.out.println("Yo habito en " + persistencia.HABITAD_DESTERRADOS);
	}

	public void sentir() 
	{
		System.out.println("Yo siento " + persistencia.SENTIR_DESTERRADOS);
	}
	
	public void arrastrarse()
	{
		System.out.println("Me arrastro como las serpientes en tierra caliente");
	}

}
