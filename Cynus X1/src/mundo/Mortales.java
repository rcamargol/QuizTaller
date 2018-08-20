package mundo;

public class Mortales extends Decendientes {
	
	
	
	public Mortales(String pNombre, int pEdad, Double pEstatura, String pColorOjos, Boolean pAlma) {
		super(pNombre, pEdad, pEstatura, pColorOjos, pAlma);
		
		ColorOjos = "Violeta";
	}
	public void conocimiento(){
		
	}
	public void tenerFamilia() {
		
	}
	public void profesión() {
		
	}
	 

	
	public void Habitar() {
		System.out.println("yo siempre he abitado el este del planeta");		
	}

	
	public void sentir() {
		System.out.println("yo puedo sentir a otros mortales ");
	}

}
