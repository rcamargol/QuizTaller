package modelo;

import javax.swing.JOptionPane;

public class Mortales extends KublaKan
{
	
	private Persistencia persistencia;

	public Mortales(int edad, int estatura, String colorDeOjos, boolean alma) 
	{
		
		super(edad, estatura, colorDeOjos, alma);

		persistencia = new Persistencia();
	}

	public void habitar()
	{
		System.out.println("Yo habito en " + persistencia.HABITAD_MORTALES);
	}

	public void sentir() 
	{
		System.out.println("Yo siento " + persistencia.SENTIR_MORTALES);
	}

	public void adquirirConocimiento()
	{
		System.out.println("Yo adquiero conocimiento de cualquier materia, si quieres pregunta y yo te dire si se sobre ese campo");
		String respuesta = JOptionPane.showInputDialog(null, "Area");
		JOptionPane.showMessageDialog(null, "Yo si se sobre " + respuesta);
	}
	
	public void tenerFamilia()
	{
		System.out.println("Yo tengo familia");
	}
	
	public void ejercerProfesion()
	{
		System.out.println("Yo puedo trabajar");
	}
}
