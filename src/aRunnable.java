import java.util.Scanner;

public class aRunnable implements Runnable{
	
	private String nombre;
	private static int n;
	private long s;
	
	public aRunnable(String nombre)
	{
		Scanner lector = new Scanner(System.in);
		this.nombre=nombre;
		System.out.println("Ingrese los milisegundos de sleep del thread "+nombre);
		s = lector.nextLong();
	}
	
	public void run()
	{
		try{
			if(nombre=="Pares")
			{
				for(int i=0;i<=n/2;i++)
				{
					if(i==0)
					{
						
					}else{
						System.out.println(2*i);
					}
					Thread.sleep(s);
				}	
			}
			else if(nombre=="Impares")
			{
				for(int i=0;i<n/2;i++)
				{
					System.out.println((2*i)+1);
					Thread.sleep(s);
				}	
			}
		}catch(Exception e){}	
		System.out.println("Saliendo: "+nombre);
	}
	
	public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el n�mero mayor de rango");
		n = lector.nextInt();
		
		Thread thread20=new Thread(new aRunnable("Pares"));	
		Thread thread10=new Thread(new aRunnable("Impares"));	
		thread20.start();
		thread10.start();
		
		
	}
}