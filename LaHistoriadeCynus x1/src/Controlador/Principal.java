package Controlador;

import modelo.Desterrados;
import modelo.Heroes;
import modelo.Mortales;

public class Principal {
	private static final String Kira = " Mi nombre es kira ";
	private static final String Astar = " Mi nombre es Astar ";
	private static final String Renk = " Mi nombre es Renk ";
	private static final String Sebastian = " Mi nombre sebastian ";
	private static final String Angel = " Mi nombre es angel ";
	private static Heroes her1;
	private static Heroes her2;
	private static Desterrados des1;
	private static Mortales mor1;
	private static Mortales mor2;

	
	
	public static void main(String[] args) {
		her1=new Heroes(Kira, 20, null, 3, true);
		her2=new Heroes(Astar, 25, null, 3, true);
		des1=new Desterrados(0, Renk, 0, false);
		mor1=new Mortales(0, Sebastian, 0, false);
		mor2=new Mortales(0, Angel, 0, false);
		System.out.println("Historia de Cynus x1");
		System.out.println(" Nuestros heroes :"+ Kira+Astar+" Nuestros mortales:"+Sebastian+Angel+" y nuestro enemigo el desterrado: "+ Renk);
		System.out.println("Kira:");
		her1.Habitan();
		her1.sentir();
		System.out.println("Astar:");
		her2.sentir();
		her2.Habitan();
		  System.out.println("yo soy sebatian:");
		mor1.sentir(); 
		mor1.profesion();
		  System.out.println("yo soy angel:");
		mor2.sentir();
		mor2.getProfesion();
		
		
		
		
		
		
	
		
	}
}
