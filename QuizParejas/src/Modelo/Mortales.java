package Modelo;

public class Mortales extends Kublakan
{
	
	private String sentir;
	private String don;
	
	
	public Mortales(int Pedad, double Pestatura, String Pcolordeojos, String alma)
	
	{
		super(Pedad, Pestatura, Pcolordeojos, alma);
		// TODO Auto-generated constructor stub
		super.setColorDeOjos("Violeta");
	}

	public void donesHumanos() 
	{
		don = "Adquirir conocimiento, tener familia, ejercer una profesión ";
		dones(don);
	}
	
	public void sentirMortales(String pnombre)
	{
		sentir = pnombre + "Pueden sentir presencia de otros mortales";
		
		sentir(sentir);
	}
}



