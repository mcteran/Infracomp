
public class Ejemplo2 implements Runnable
{
	public void run()
	{
		System.out.println("Implementando la interfaz Runnable.");
	}
	public static void main(String [] args)
	{
		Thread t = new Thread(new Ejemplo2());
		t.start();
		
	}

}

