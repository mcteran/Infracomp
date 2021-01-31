
public class Taller1B2 extends Thread
{
	private static int contador = 0;
	


	public void run()
	{
		for (int i = 0; i < 10000; i++)
		{
			contador++;
		}

	}
	
	public static void main(String [] args)
	{
		Taller1B2[] t = new Taller1B2[1000];
		
		
		for (int i =0; i<t.length; i++)
		{
			t[i] = new Taller1B2();
			t[i].start();
		}
		System.out.println(contador);
		
	}
}
