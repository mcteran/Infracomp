
public class Ejemplo3 extends Thread
{
	private int n;
	
	
	public Ejemplo3(int n)
	{
		System.out.println("Extendiendo la clase Thread.");
		this.n = n;
	}
	public void run()
	{
		System.out.println("El valor inicial es:" + n);
	}
	public static void main(String [] args)
	{
		Ejemplo3 t = new Ejemplo3(5);
		t.start();
		
	}

}
