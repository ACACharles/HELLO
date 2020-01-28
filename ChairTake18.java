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
	LazyBoi(){type = "rocking chair";}
	
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
		LazyBoi.legs = "posts";
		LazyBoi.type = "rocking chair";
		LazyBoi.color = "brown";
		LazyBoi.material = "leather";
		
		LazyBoi.basicChair();
		
		
	
	}
}
	
	
	
	
	
	