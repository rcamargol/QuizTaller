package modelo;

public class Mortales extends KublaKan
{
	
	private String C1;
	private String C2;
	public Mortales(int pEdad, String pColorOjos, double pEstatura ,String pC1, String pC2) 
	{
		super(pEdad, pColorOjos, pEstatura);
		this.C1 = pC1;
		this.C2 = pC2;
	}
	
	public String getC1() 
	{
		return C1;
	}

	public void setC1(String c1) 
	{
		C1 = c1;
	}

	public String getC2() 
	{
		return C2;
	}

	public void setC2(String c2) 
	{
		C2 = c2;
	}

	public void adCono()
	{
		System.out.println("Yo adquiero conocimiento " + C1 + ".");
		System.out.println("Yo adquiero conocimiento " + C2 + ".");
	}
	
	public void tenerFamilia()
	{
		System.out.println("Naci solo muero solo");
	}
	
	public void ejeProfe()
	{
		System.out.println("Soy Ingeniero de sistemas");
	}

	public void habitar() 
	{
		System.out.println("Habitamos en el Este del planeta.");
	}

	public void sentir() 
	{
		System.out.println("Puedo sentir la presencia de otros mortales");
	}
}