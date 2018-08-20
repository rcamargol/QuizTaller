package mundo;

public abstract class Decendientes {
	protected String nombre;
	protected int edad;
	protected Double estatura;
	protected String ColorOjos;
	protected Boolean alma;
	
	
	
	
	public Decendientes(String pNombre ,int pEdad, Double pEstatura, String pColorOjos, Boolean pAlma) {
		nombre = pNombre;
		edad = pEdad;
		estatura = pEstatura;
		ColorOjos = pColorOjos;
		alma = pAlma;
	}
	

	public abstract  void Habitar() ;
	
	public abstract void sentir();
	
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Double getEstatura() {
		return estatura;
	}
	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}
	public String getColorOjos() {
		return ColorOjos;
	}
	public void setColorOjos(String colorOjos) {
		ColorOjos = colorOjos;
	}
	public Boolean getAlma() {
		return alma;
	}
	public void setAlma(Boolean alma) {
		this.alma = alma;
	}
	
}
