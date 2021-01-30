
public class Ejemplo21b extends Thread{

	private static int contador=0;
	
	public void run()
	{
		for(int i=0;i<10000;i++)
		{
			contador++;
		}
	}
	public static void main(String[] args)
	{
		Ejemplo21b[] t=new Ejemplo21b[1000];
		for(int i=0; i<t.length;i++)
		{
			t[i]=new Ejemplo21b();
			t[i].start();
		}
		System.out.println(contador);
	}
	
}
