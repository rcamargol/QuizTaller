package modelo;

public abstract class   Kubakan {
protected int edad;
protected String colorOjos;
protected double estatura;
protected boolean alma;
protected String nombre;
public Kubakan(int edad, String colorOjos, double estatura, boolean alma) {
	super();
	this.edad = edad;
	this.colorOjos = colorOjos;
	this.estatura = estatura;
	this.alma = alma;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getColorOjos() {
	return colorOjos;
}
public void setColorOjos(String colorOjos) {
	this.colorOjos = colorOjos;
}
public double getEstatura() {
	return estatura;
}
public void setEstatura(double estatura) {
	this.estatura = estatura;
}
public boolean isAlma() {
	return alma;
}
public void setAlma(boolean alma) {
	this.alma = alma;
}

}
