class ChairTake18
{
	boolean back;
	boolean seat;
	String legs; // wheels, posts
	String type; // Computer chair, rocking chair, folding chair
	String color;
	String material; //wood, plastic, metal
	
	void basicChair()
	{
		if(back && seat == true)
		
		System.out.println("This is a Chair continue with other features. ");
		
		else
			System.out.println("This is not a Chair start over. ");
	}
		 
	void style()
	{
		System.out.println("What kind of legs does this chair have? " + legs);
		System.out.println("What type of chair is this? " + type);
		System.out.println("What color is the chair? " + color);
		System.out.println("What material is the chair made of? " + material);
	}		
}

class LazyBoi extends ChairTake18
{
	void reclines()
	{
			if(isReclined == true){
			
				isReclined = false;
			}
			else isReclined = true;

	
	}
	
	void style()
	{
	
		System.out.println("This is a LazyBoi");
		
		super.style();
		
		
		
	}
	LazyBoi(){type = "Rocking Chair";}
	
	boolean isReclined = false;
	boolean footRest = true;
	boolean handle = true;
	
	
	
	

}
	
class ChairDemo
{
		public static void main(String args[])
	{
	
		ChairTake18 LazyBoi = new ChairTake18();
	
		LazyBoi.back = true;
		LazyBoi.seat = true;
		LazyBoi.legs = "Posts";
		LazyBoi.type = "Rocking Chair";
		LazyBoi.color = "Brown";
		LazyBoi.material = "Leather";
		
		
		LazyBoi.basicChair();
		System.out.println();
		LazyBoi.style();
		System.out.println();
		
		ChairTake18 ComputerChair = new ChairTake18();
		
		ComputerChair.back = true;
		ComputerChair.seat = true;
		ComputerChair.legs = "Wheels";
		ComputerChair.type = "Office Chair";
		ComputerChair.color = "Grey";
		ComputerChair.material = "Metal";
		
		ComputerChair.basicChair();
		System.out.println();
		ComputerChair.style();
		System.out.println();
	
		
		
	
	}
}
	
	
	
	
	
	