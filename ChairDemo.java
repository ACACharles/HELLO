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
	
		ChairTake18 LB18 = new ChairTake18();
	
		LB18.back = true;
		LB18.seat = true;
		LB18.legs = "Posts";
		LB18.type = "Rocking Chair";
		LB18.color = "Brown";
		LB18.material = "Leather";
		
		
		LB18.basicChair();
		System.out.println();
		LB18.style();
		System.out.println();
		
		LazyBoi LB19 = new LazyBoi();
	
		LB19.back = true;
		LB19.seat = true;
		LB19.legs = "Posts";
		LB19.type = "Rocking Chair";
		LB19.color = "Brown";
		LB19.material = "Leather";
		
		
		LB19.basicChair();
		System.out.println();
		LB19.style();
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
	
	
	
	
	
	