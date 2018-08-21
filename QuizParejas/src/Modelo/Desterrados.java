package Modelo;

public class Desterrados extends Kublakan {

	private String sentir;
	private String don;
	
	public Desterrados(int Pedad, double Pestatura, String Pcolordeojos, String alma) {
		super(Pedad, Pestatura, Pcolordeojos, alma);
		// TODO Auto-generated constructor stub
		
		super.setAlma("Falsa");
		super.setEdad(1500);
	}

	public void donesDesterrados() 
	{
		don = "Arrastrar de un lugar a otro";
		dones(don);
	}
	
	public void sentirDesterrados(String pnombre)
	{
		sentir = pnombre + "Solo se sienten a si mismos";
		
		sentir(sentir);
	}
	
	
}
