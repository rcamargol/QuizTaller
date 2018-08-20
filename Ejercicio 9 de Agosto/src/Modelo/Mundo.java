package Modelo;

public class Mundo 
{
	private Heroe kira;
	private Heroe astar;
	private Desterrado renk;
	private Mortal carlos;
	private Mortal santiago;
	
	public Mundo()
	{
		kira = new Heroe(150, "Azul", true, "Kira");
		astar = new Heroe(200, "Cafe", true, "Astar");
		renk = new Desterrado(400, "Negro", false, "Renk", 1);
	
	}
}
