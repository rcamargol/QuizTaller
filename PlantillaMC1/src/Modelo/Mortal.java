package Modelo;

public class Mortal extends KublaKan {

  public Mortal(String nombre) {
	  super.nombre = nombre;
    super.colorOjos = "violeta";
    super.habitar("Este del planeta");
    super.sentir("Presencia de otros mortales");
  }
    public void adquirirConocimiento() {
    	System.out.println("Puedo aprender muchas cosas");
    }
    public void tenerFamilia(){
    	System.out.println("Tengo 2 hijos, una esposa y una mosa");
    }
    public void ejercerProfesion(){}

}
