package controlador;

import modelo.Mundo;

public class Principal 
{
	private static Mundo m;
	
	public static void main(String[] args) 
	{
		m = new Mundo();
		m.getDes1();
		m.getHer1();
		m.getMor1();
	}
}
