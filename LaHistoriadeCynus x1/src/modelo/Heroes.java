package modelo;
public class Heroes extends Kubakan{
private String sentir;
private String nombre;
	public Heroes(String nombre ,int edad, String colorOjos, double estatura, boolean alma) {
		super(edad, colorOjos, estatura, alma);
		// TODO Auto-generated constructor stub
		edad=0;
		colorOjos="";
		estatura=3;
		alma=true;
		sentir="No siento a nadie solo mi presencia ";
		nombre="";
	}
	
public void Habitan()
{
	System.out.println(" Habito al norte del planeta");
}
public void sentir() 
{
System.out.println("siento la presencia de seres de otro mundo ");	
}
public void volar() 
{
	
}
public void crearfuego() 
{
	
}
public void detenerTiempo() 
{
	
}

}
