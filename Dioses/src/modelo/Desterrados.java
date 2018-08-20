package modelo;

public class Desterrados extends Kublakan {
	
	public Desterrados(String pAlma, String pColorOjos, int pEdad, double pEstatura)
	{
		super.estatura = pEstatura;
		super.alma = "Falsa";
		super.colorOjos = pColorOjos;
		super.edad = pEdad;
	}
	
	public String arrastraban()
	{
		return "Me arrastro por todos lados";
	}
	
	public String informacion()
	{
		return "Mido "+super.estatura +" metros"+","+"Tengo un alma "+ super.alma+ ","+"Mis ojos son "+super.colorOjos+","+"Tengo "+super.edad+" años";
	}

	public String habilitar() {

		return "Habito en el extremo sur del planeta";
	}


	public String sentir() {
		return "Solo me siento a mi mismo";
	}


}
