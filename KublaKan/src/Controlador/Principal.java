package Controlador;

import Modelo.Heroe;
import Modelo.Mortal;
import Modelo.Mundo;

public class Principal {
	
	
	private static Heroe kira;
	private static Heroe astar;
	private static Mortal pepe;

	Mundo m;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		kira = new Heroe("Kira", 355, 3.40, "azul", "", "controlo el tiempo") {
		};
		
		astar = new Heroe("Astar", 120, 3.50, "rojo", "", "escupo fuego") {
		};
		
		
		
		
		kira.heroe();
		astar.heroe();

	}
	
	//aqui van los demás métodos que se invocan de Mundo.
}
