package modelo;

public class Desterrados extends Kubakan{
private String sentir;
	public Desterrados(int edad, String colorOjos, double estatura, boolean alma) {
		super(edad, colorOjos, estatura, alma);
		// TODO Auto-generated constructor stub
		edad=1500;
		colorOjos="";
		estatura= 0;
		alma=false;
		sentir="No siento a nadie ";
	}
	
	public void Habitan()
	{
		System.out.println("voy de un lugar a otro");
	}
	
	
}
