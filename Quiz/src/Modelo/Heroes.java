package Modelo;

public class Heroes extends Kublakan 
{

	private String sentir;
	private String don;
	
	public Heroes(int Pedad, double Pestatura, String Pcolordeojos, String alma) 
	
	{
		super(Pedad, Pestatura, Pcolordeojos, alma);
		// TODO Auto-generated constructor stub
		
		super.setEstatura(3);
	}

	public void donesHeroes()
	{
		don = "Crear fuego, detener tiempo y volar";
		dones(don);
		
	}
	
	public void sentirHeroes(String pnombre)
	{
		sentir = pnombre + "a si mismos y seres de otro mundo";
		
		sentir(sentir);
	}
	
	

	
	
	
}
