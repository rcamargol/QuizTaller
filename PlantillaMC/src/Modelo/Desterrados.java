package Modelo;

public class Desterrados extends KublaKan {

	private String arrastrar;

	public Desterrados(String arrastrar) {
		super(edad, estatura, colorOjos, alma);
		this.arrastrar = "Mi maldicion es arrastrarme";
	}

	public String getArrastrar() {
		return arrastrar;
	}

	public void setArrastrar(String arrastrar) {
		this.arrastrar = arrastrar;
	}

	@Override
	public void poderes() {
		// TODO Auto-generated method stub
		
		System.out.println("Los poderes con los que cuenta Renk son: " + this.arrastrar);
		
	}

}
