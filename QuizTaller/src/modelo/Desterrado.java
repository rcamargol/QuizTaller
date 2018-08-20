package modelo;

public class Desterrado extends KublaKan
{

	public Desterrado(int pEdad, String pColorOjos, double pEstatura) 
	{
		super(pEdad, pColorOjos, pEstatura);
	}
	public void arrastraban() 
	{
		System.out.println("Me puedo mover de un lugar a otro");
	}
	public void habitar() 
	{
		System.out.println("Haboto en el extremo Sur del planeta");
	}

	public void sentir() 
	{
		System.out.println("No siento a nadie mas que a mi mismo");
	}
}