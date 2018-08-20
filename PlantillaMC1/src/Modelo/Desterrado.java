package Modelo;

public class Desterrado extends KublaKan {

	public Desterrado(String nombre) {
		super.nombre = nombre;
		super.edad = 1500;
		super.alma = false;
		super.habitar("Extremo sur del planeta");
		super.sentir("A nosotros mismos");
	}

	public void arrastrar(String ubicacion) {
		System.out.println("Me arrastre hasta " + ubicacion);
	}

	public void cuantosAños() {
		System.out.println("Vivo hasta los " + super.edad + " años");
	}

}
