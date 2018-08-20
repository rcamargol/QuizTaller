package Modelo;

public class Heroe extends KublaKan
{
	private boolean volar;
	private boolean crearFuego;
	private boolean detenerEltiempo;
	
	public Heroe(int edad, String colorOjos,boolean alma, String nombre)
	{
		super.edad = edad;
		super.colorOjos = colorOjos;
		super.estatura = 3;
		super.alma = alma;
		volar = true;
		crearFuego = true;
		detenerEltiempo = true;
		super.nombre=nombre;	
	}
	
	public boolean isVolar() {
		return volar;
	}

	public void setVolar(boolean volar) {
		this.volar = volar;
	}

	public boolean isCrearFuego() {
		return crearFuego;
	}

	public void setCrearFuego(boolean crearFuego) {
		this.crearFuego = crearFuego;
	}

	public boolean isDetenerEltiempo() {
		return detenerEltiempo;
	}

	public void setDetenerEltiempo(boolean detenerEltiempo) {
		this.detenerEltiempo = detenerEltiempo;
	}

	@Override
	public void habitar() {
		System.out.println("El heroe "+ this.nombre +" habita en el norte del planeta Cynus x1");
	}

	@Override
	public void sentir() {
		System.out.println("El heroe "+this.nombre+" siente al otro heroe");
	}
	
	public void mostrarAtributos()
	{
		if(volar==true)
		{
			System.out.println("El heroe puede volar");
		}
	}

	
}
