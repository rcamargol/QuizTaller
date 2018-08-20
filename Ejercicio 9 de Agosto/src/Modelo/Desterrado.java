package Modelo;

public class Desterrado extends KublaKan
{
	private String movimiento;
	
	public Desterrado(int edad, String colorOjos,boolean alma, String nombre, int estatura)
	{
		super.alma = false;
		super.colorOjos = colorOjos;
		super.edad = 1500;
		super.estatura = estatura;
		super.nombre = nombre;
		movimiento = "Arrastrar";
	}

	@Override
	public void habitar() 
	{
		System.out.println("El desterrado " + this.nombre + " habita en el sur del planeta");
	}

	@Override
	public void sentir() {
		System.out.println("El desterrado " + this.nombre + " solo se siente a si mismo");
	}
	
	public void arrastrar()
	{
		System.out.println("El desterrado " + this.nombre + " solo puede arrastrarse");
	}

}
