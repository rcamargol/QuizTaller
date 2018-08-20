package Modelo;

public class Heroes extends KublaKan {

	private String volar;
	private String crearFuego;
	private String detenerEltiempo;

	public Heroes(String volar, String crearFuego, String detenerEltiempo) {
		super (edad, estatura, colorOjos, alma);
		this.volar = "Poder volar como pajaro";
		this.crearFuego = "La llama vive en nosotros";
		this.detenerEltiempo = "El tiempo es oro";
	}

	public String getVolar() {
		return volar;
	}

	public void setVolar(String volar) {
		this.volar = volar;
	}

	public String getCrearFuego() {
		return crearFuego;
	}

	public void setCrearFuego(String crearFuego) {
		this.crearFuego = crearFuego;
	}

	public String getDetenerEltiempo() {
		return detenerEltiempo;
	}

	public void setDetenerEltiempo(String detenerEltiempo) {
		this.detenerEltiempo = detenerEltiempo;
	}

	@Override
	public void poderes() {
		// TODO Auto-generated method stub
		System.out.println("Los poderes con los que cuentan Kira y Astar son: " + this.volar + ", " + this.crearFuego + ", " + this.detenerEltiempo);
	}

}
