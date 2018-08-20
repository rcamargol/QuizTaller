package Modelo;

public class Heroe extends KublaKan {

	public Heroe(String nombre) {
		super.nombre = nombre;
		super.estatura = Persistencia.HEROE_ESTATURA;
		super.habitar("Norte del planeta");
		super.sentir("A si mismos y a seres de otros mundos");
	}

	public void volar() {
		System.out.println("Estoy volando");
	}

	public void crearFuego() {
		System.out.println("Estoy creando fuego");
	}

	public void detenerTiempo() {
		System.out.println("dsffa");
	}
}
