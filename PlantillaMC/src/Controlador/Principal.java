package Controlador;

import Modelo.Heroes;
import Modelo.Mortales;
import Modelo.Desterrados;
import Modelo.KublaKan;

public class Principal {

	private static Heroes h;
	private static Mortales m;
	private static Desterrados d;
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		h = new Heroes(null, null, null);
		m = new Mortales(null, null);
		d = new Desterrados(null);
		
		h.poderes();
		m.poderes();
		d.poderes();
		
	}
	
	//aqui van los demás métodos que se invocan de Mundo.
}
//NOTA 