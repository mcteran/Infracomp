
public class Ejemplo1 extends Thread
{
	public void run()
	{
		System.out.println("Extendiendo la clase Thread.");
	}
	public static void main(String [] args)
	{
		Ejemplo1 t = new Ejemplo1();
		t.start();
		
	}

}
