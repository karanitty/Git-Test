class Super
{
	void display()
	{
		System.out.println("Good Morning");
	}
}



class Hello extends Super
{
	public static void main (String args[])
	{
		System.out.println("Hello World");
		Hello a = new Hello();
		a.display();
	}
}
