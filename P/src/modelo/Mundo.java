package modelo;

public class Mundo 
{
	
	private Mortal mortal;
	
	public Mundo()
	{
		mortal = new Mortal(19, 1.68, "NO FUNCIONA", true);
		System.out.println("Me llamo David, soy un mortal que tiene " + mortal.getEdad() + " años de vida y mis ojos son de color " + mortal.getColorOjos() + ".");
		
	}
}
