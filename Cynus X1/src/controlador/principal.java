package controlador;

import modelo.Desterrados;
import modelo.Heroes;
import modelo.Mortales;

public class principal 
{
	public static void main(String[] args) 
	{
		Heroes Kira = new Heroes(0, 3000, "S�", "Azul", "Norte del Planeta", "A s� mismo y seres de otro mundo");
		Heroes Astar = new Heroes(50, 3000, "S�", "Rojo", "Norte del planeta", "Seres de otro mundo");
		Desterrados Renk = new Desterrados(1500, 0, "Alma falsa", null, "Extremo Sur", "Solo me siento a m� mismo");
		
		Mortales Julian = new Mortales(18, 170, "S�", "Negro", "Este", "Presencia de mortales");
		Mortales Andres = new Mortales(18, 180, "S�", "casta�o", "Este", "Otros mortales");
		

		Renk.arrastrar();
		
		Kira.crearFuego();
		Kira.detenerTiempo();
		Kira.volar();
		
		Astar.crearFuego();
		Astar.detenerTiempo();
		Astar.volar();
		
		
		
		Julian.adquirirConocimientos();
		Julian.ejercerProfesion();
		Julian.tenerFamilia();
		
		Andres.adquirirConocimientos();
		Andres.ejercerProfesion();
		Andres.tenerFamilia();
		
		
	}
	
	
}
