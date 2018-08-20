package Modelo;

public class Mortal extends KublaKan
{

	private boolean familia;
	private boolean conocimiento;
	private String profesion;
	
	public Mortal(boolean familia, boolean conocimiento, String profesion)
	{
		super.colorOjos = "Violeta";
		super.alma = true;
		super.edad = edad;
		super.estatura = estatura;
		super.nombre = nombre;
		this.familia = familia;
		this.conocimiento = conocimiento;
		this.profesion = profesion;
	}

	public void darProfesion()
	{
		System.out.println("La profesion de " + this.nombre + " es " + this.profesion);
	}
	
	public void conocimiento()
	{
		if(this.conocimiento == true)
		{
			System.out.println("El mortal " + this.nombre + " tiene conocimiento");
		}
		else
		{
			System.out.println("El mortal " + this.nombre + " no tiene conocimiento");
		}
	}
	@Override
	public void habitar() {
		System.out.println("El mortal " + this.nombre +" habita en el este del planeta.");		
	}

	@Override
	public void sentir() {
		System.out.println("El mortal " + this.nombre + " siente a los otros mortales");
	}

}
