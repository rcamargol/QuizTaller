package Modelo;

public class CynuxX1 
{

	private Heroes heroe1;
	private Heroes heroe2;
	private Desterrados desterrado1;
	private Mortales mortal1;
	private Mortales mortal2;
	
	
	public CynuxX1()
	{
		
	heroe1 = new Heroes(15, 3.0, "azules", "Alma no definida");
	heroe2 = new Heroes(20, 3.0, "azules", "Alma no definida");
	desterrado1 = new Desterrados(1500, 2.0, "Negros", "falsa");
	mortal1 = new Mortales(21, 1.73, "cafes", "indefinida");
	mortal2 = new Mortales(20, 1.75, "cafes", "indefinida");
	}
	
	
	public void Mostrar()
	{
	 heroe1.sentirHeroes("Kira");
	 heroe1.donesHeroes();
	 heroe2.sentirHeroes("Astar");
	 heroe2.donesHeroes();
	 desterrado1.sentirDesterrados("Renk");
	 desterrado1.donesDesterrados();
	 mortal1.sentirMortales("sebastian");
	 mortal1.donesHumanos();
	 mortal2.sentirMortales("daniel");
	 mortal2.donesHumanos();
	}
	
}
