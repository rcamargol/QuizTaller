package Controlador;

import Modelo.Mundo;

public class Principal {

	private static Mundo m;
	
	public static void main(String[] args) 
	{
		m = new Mundo();
		
		System.out.println("Mi nombre es " + m.getHeroes()[0].getNombre());
		m.getHeroes()[0].volar();
		m.getHeroes()[0].crearFuego();
		
		System.out.println("Mi nombre es " + m.getHeroes()[1].getNombre());
		m.getHeroes()[1].volar();
		m.getHeroes()[1].crearFuego();
		
		
		System.out.println("Mi nombre es " + m.getDesterrados()[0].getNombre());
		m.getDesterrados()[0].arrastrar("cueva");
		m.getDesterrados()[0].cuantosAños();
		
		System.out.println("Mi nombre es " + m.getMortales()[0].getNombre());
		m.getMortales()[0].adquirirConocimiento();
		m.getMortales()[0].tenerFamilia();
		
		System.out.println("Mi nombre es " + m.getMortales()[1].getNombre());
		m.getMortales()[1].adquirirConocimiento();
		m.getMortales()[1].tenerFamilia();
		
	
		
	}
	
	//aqui van los demás métodos que se invocan de Mundo.
}
