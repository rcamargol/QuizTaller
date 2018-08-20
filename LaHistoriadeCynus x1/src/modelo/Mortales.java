package modelo;
public class Mortales extends Kubakan {
	private  String familia;
	private String profesion ;
	public Mortales(int edad, String colorOjos, double estatura, boolean alma) {
		super(edad, colorOjos, estatura, alma);
		// TODO Auto-generated constructor stub
		colorOjos="ojos color violeta";
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
public void sentir() 
{
System.out.println("soy mortal y solo puedo sentir a las personas");	
}
public void profesion () {
	  System.out.println("y soy programador ");
}
  
}
