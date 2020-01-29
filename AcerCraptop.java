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
	void VideoOut(boolean GraphicsCard)
	{
		GraphicsCard = true;
		if(GraphicsCard)
			System.out.println("Video out is displayport.");
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
		System.out.println("battery, screen, and keyboard: " + battery + " " + screen + " " + keyboard);
	}
	void model()
	{
		System.out.println("small boy 3000");
	}
	void VideoOut(boolean NoPorts)
	{
		NoPorts = false;
		
		if(!NoPorts)System.out.println("No External video outputs.");
	}
	
	void VideoOut(String ExternalPort)
	{
		ExternalPort = "VideoOut is HDMI.";
		
		System.out.println(ExternalPort);
	}
}

class AcerCraptop
{
	public static void main(String args[])
	{
		Laptops subOb = new Laptops("screen", "keyboard", "too small");
		
		subOb.show();
		
		Demo();
	}
	public static void Demo()
	{
		Computers desktop = new Computers("screen", "keyboard");
		Laptops laptop = new Laptops("screen", "keyboard", "too small");
		
		Computers ComputersRef;
		
		ComputersRef = desktop;
		ComputersRef.show();
		ComputersRef.model();
		ComputersRef.VideoOut(true);
		
		ComputersRef = laptop;
		ComputersRef.show();
		ComputersRef.model();
		ComputersRef.VideoOut(false);
	}
}