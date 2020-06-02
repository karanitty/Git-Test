class Newthread extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Thread i = " +i);
		}
		System.out.println("Exiting from thread");
	}
}

class Alright implements Runnable
{
	public void run()
	{
		for(int j=5; j>0; j--)
		{
			System.out.println("Thread j = " +j);
		} 
	}
}

class Morning 
{
	public static void main(String args[])
	{
		Newthread a = new Newthread();
		a.start();
		Alright b = new Alright();
		Thread t = new Thread(b);
		t.start();
	}
}