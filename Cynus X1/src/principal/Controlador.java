package principal;

import mundo.Desterrados;
import mundo.Heroes;
import mundo.Mortales;

public class Controlador {
	
	private Heroes he;
	private Mortales mor;
	private Desterrados des;
	
	
	public static void main(String[] args) {
		
		Heroes he = new Heroes(null, 0, null, null, null);
		he.Habitar();
		
		Mortales mor  = new Mortales(null, 0, null, null, null);
		mor.Habitar();
		
		Desterrados des = new Desterrados(null, 0, null, null, null);
		des.Habitar();
		
		
		
	}
	
	
		
	}
	
	


