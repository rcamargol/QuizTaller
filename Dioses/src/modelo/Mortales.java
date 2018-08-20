package modelo;

public class Mortales extends Kublakan{
	
	public Mortales(String pAlma, int pEdad, double pEstatura)
	{
		super.estatura = pEstatura;
		super.alma = pAlma;
		super.colorOjos = "Violeta";
		super.edad = pEdad;
	}
	
	public String adquirirC()
	{
		return "Solo sé que nada sé";
	}
	
	public String familia()
	{
		return "Tengo una familia de mortales";
	}
	
	public String ejercer()
	{
		return "Soy albañil";
	}

	public String informacion()
	{
		return "Mido "+super.estatura +" metros"+","+"Tengo un alma "+ super.alma+ ","+"Mis ojos son "+super.colorOjos+","+"Tengo "+super.edad+" años";
	}
	public String habilitar() {

		return "Y vivo en el este del planeta";
	}


	public String sentir() {
		return "Y vivo en el este del planeta";
	}


}
