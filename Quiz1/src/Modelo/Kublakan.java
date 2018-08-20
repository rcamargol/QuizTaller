package Modelo;

public abstract class Kublakan {
	
	
	protected static int edad;
	protected static double estatura;
	protected String colorOjos;
	protected static boolean alma;
	protected String planeta;
	protected String sentir;
	
	
	public abstract void habitarPlaneta();
	public Kublakan(int edad, double estatura, String colorOjos, boolean alma) {
		super();
		this.edad = edad;
		this.estatura = estatura;
		this.colorOjos = colorOjos;
		this.alma = alma;
	}
	public abstract void sentir();
	public abstract void habitar();
}
