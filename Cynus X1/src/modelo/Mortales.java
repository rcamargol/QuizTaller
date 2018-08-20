package modelo;

public class Mortales extends KublaKan
{
	private String adConocimientos;
	private String tenerFamilia;
	private String ejProfesion;
	
	public Mortales(int pEdad, int pEstatura, String pAlma, String pColorOjos, String pHabitar, String pSentir) 
	{
		super(pEdad, pEstatura, pAlma, pColorOjos, pHabitar, pSentir);
		// TODO Auto-generated constructor stub
	}
	
	public void adquirirConocimientos()
	{
		System.out.println("Yo adquiero conocimientos");
	}
	
	public void tenerFamilia()
	{
		System.out.println("Yo tengo familia");
	}
	
	public void ejercerProfesion()
	{
		System.out.println("Yo ejerzo profesión");
	}
	
}
