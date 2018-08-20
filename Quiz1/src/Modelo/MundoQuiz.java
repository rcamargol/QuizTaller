package Modelo;

public class MundoQuiz {

	
	
		private Desterrados d;
		public Heroes [] arregloH;
		public Mortales[] arreglom;
		
		public MundoQuiz()
		{
			arregloH = new Heroes[2];
			arregloH[0] = new Heroes(25,3,"Rojos", true, "Kira") ;
			arregloH[1] = new Heroes(35, 3, "verdes", true, "Astar");
			
			
			arreglom = new Mortales [2];
			arreglom[0] = new Mortales (17, 1.60, "violeta", true, "Paula Deaza");
			arreglom[1] = new Mortales(17, 1.70, "violeta", true, "Sebastian cubillos");
			
		
		}


		public Desterrados getD() {
			return d;
		}

		public void setD(Desterrados d) {
			this.d = d;
		}

		public Heroes[] getArregloH() {
			return arregloH;
		}

		public void setArregloH(Heroes[] arregloH) {
			this.arregloH = arregloH;
		}

		public Mortales[] getArreglom() {
			return arreglom;
		}

		public void setArreglom(Mortales[] arreglom) {
			this.arreglom = arreglom;
		}
		
}
