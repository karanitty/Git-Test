class Newthread extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Thread = " +i);
		}
		System.out.println("Exiting from thread");
	}
}

class Morning 
{
	public static void main(String args[])
	{
		Newthread a = new Newthread();
		a.start();
	}
}