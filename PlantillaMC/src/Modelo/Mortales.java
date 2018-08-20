package Modelo;

public class Mortales extends KublaKan {

	private String Conocimientos;
	private String profesion;

	public Mortales(String conocimientos, String profesion) {
		super(edad, estatura, colorOjos, alma);
		Conocimientos = "entender que el conocimiento es poder";
		this.profesion = "llegar lejos con lo que hacemos";
	}

	public String getConocimientos() {
		return Conocimientos;
	}

	public void setConocimientos(String conocimientos) {
		Conocimientos = conocimientos;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	@Override
	public void poderes() {
		// TODO Auto-generated method stub
		
		System.out.println("Los poderes con los que cuentan Juan y Julian son: " + this.Conocimientos + ", " + this.profesion);
		
	}

}
