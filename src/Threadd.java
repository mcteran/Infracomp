import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Threadd extends Thread
{
    private String n;
    static int contador = 1;
	static int limite;
	
	public Threadd(String n)
	{
		System.out.println("Extendiendo la clase Thread.");
		this.n = n;
	}
	
	public boolean esPar()
	{
		boolean pe = false;
		while (contador<limite)
		{
			if (contador%2==0)
			{
				System.out.println("Par:" + contador);
				pe = true;
			}
		contador++;
		}
		return pe;
	}
	
	public static boolean esImpar()
	{
		boolean pe = false;
		while (contador<limite)
		{
			if (contador%2 !=0)
			{
				System.out.println("Impar:" + contador);
				pe = true;
			}
		contador++;
		
		}
		return pe;
	}
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String s = br.readLine();
		
		int entrada = Integer.parseInt(s);
	    limite = entrada;

	    Thread t1 = new Thread ("Thread" + contador);
	    Thread t2 = new Thread ("Thread " + contador );

	    if(esImpar()==true)
	    {
	    	t1.start();
	    }
	    
	    
	}

}
