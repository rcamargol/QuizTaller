package modelo;

public class Mundo extends KublaKan
{
	private Heroe her1;
	private Mortales mor1;
	private Desterrado des1;

	public Mundo()
	{
		her1 = new Heroe(4, "hola", 6);
		mor1 = new Mortales(0, null, 0, null, null);
		des1 = new Desterrado(0, null, 0);
	}

	public Heroe getHer1() 
	{
		return her1;
	}

	public void setHer1(Heroe her1) 
	{
		this.her1 = her1;
	}

	public Mortales getMor1() 
	{
		return mor1;
	}

	public void setMor1(Mortales mor1) 
	{
		this.mor1 = mor1;
	}

	public Desterrado getDes1() 
	{
		return des1;
	}

	public void setDes1(Desterrado des1) 
	{
		this.des1 = des1;
	}
}