package Modelo;

//Representa el mundo del problema: las clases y métodos que describen el problema 

public class Mundo {

	Persistencia BD;// se asocia a Mundo para que éste pueda interactuar con la data de
					// Persistencia.
	private Heroe[] heroes;
	private Mortal[] mortales;
	private Desterrado[] desterrados;

	public Mundo() {
		heroes = new Heroe[] { new Heroe("Kyra"), new Heroe("Astar") };
		desterrados = new Desterrado[] { new Desterrado("Renk") };
		mortales = new Mortal[] { new Mortal("David"), new Mortal("Miguel") };

	}

	public Heroe[] getHeroes() {
		return heroes;
	}

	public void setHeroes(Heroe[] heroes) {
		this.heroes = heroes;
	}

	public Mortal[] getMortales() {
		return mortales;
	}

	public void setMortales(Mortal[] mortales) {
		this.mortales = mortales;
	}

	public Desterrado[] getDesterrados() {
		return desterrados;
	}

	public void setDesterrados(Desterrado[] desterrados) {
		this.desterrados = desterrados;
	}

}
