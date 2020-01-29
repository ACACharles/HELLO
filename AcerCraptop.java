class Computers
{
	String screen, keyboard;
	Computers(String a, String b)
	{
		screen = a;
		keyboard = b;
	}
	Computers(){}
	void show()
	{
		System.out.println("screen and keyboard: " + screen + " " + keyboard);
	}
	void model()
	{
		System.out.println("Big Boy 9000");
	}
}

class Laptops extends Computers
{
	String battery;
	
	Laptops(String a, String b, String c)
	{
		super(a, b);
		battery = c;
	}
	Laptops(){}
	void show()
	{
		System.out.println("battery: " + battery);
	}
	void model()
	{
		System.out.println("small boy 3000");
	}
	
}

class AcerCraptop
{
	public static void main(String args[])
	{
		Laptops subOb = new Laptops("screen", "keyboard", "too small");
		
		subOb.show();
		
		poly();
	}
	public static void poly()
	{
		Computers desktop = new Computers("screen", "keyboard");
		Laptops laptop = new Laptops("screen", "keyboard", "too small");
		
		Computers ComputersRef;
		
		ComputersRef = desktop;
		ComputersRef.model();
		
		ComputersRef = laptop;
		ComputersRef.model();
	}
}