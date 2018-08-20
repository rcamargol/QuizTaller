package modelo;

public class Heroes extends Kublakan {

	public Heroes(String pAlma, String pColorOjos, int pEdad)
	{
		super.estatura = 3;
		super.alma = pAlma;
		super.colorOjos = pColorOjos;
		super.edad = pEdad;
	}
	
	public String volar()
	{
		return "Yo vuelo";
	}
	
	public String fuego()
	{
		return "Creo fuego con las manos";
	}
	
	public String detenerT()
	{
		return "Y puedo detener el tiempo";
	}
	
	public String informacionP()
	{
		return "Mido "+super.estatura +" metros"+","+"Tengo un alma "+ super.alma+ ","+"Mis ojos son "+super.colorOjos+","+"Tengo "+super.edad+" años"; 
	}

	public String habilitar() {

		return "Y vivo en el norte del planeta";
	}


	public String sentir() {
		return "Me siento a mi mismo y a seres de otros mundos";
	}

}
