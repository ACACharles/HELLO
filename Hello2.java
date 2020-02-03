import java.util.Scanner ;
class Hello2
{
	public static void main (String[] args )
	{
	
	Scanner UserInput = new Scanner( System.in) ;

	String Name;
	
	System.out.print(" What is your name? " ) ;
	Name = UserInput.next() ;
	
	
	if (Name.equals("Bryce")) 
	{
		System.out.print("hello Bryce");
	}
	else
	{
		System.out.print("hello user");
	}
	
	
	}

	//int a = 22;
	int b = 6;
	String c = "Bryce";
	String d = "male";
	
	
	
	
	void Decision(int a) 
	{
		switch(a)
	{
		case 22 :
		
		System.out.print(a);
		break;
		
		case 6 : 
		System.out.print(b);
		break;
			
		case 5:
		System.out.print(c);
		break;
		
		case 42:
		System.out.print(d);
		break;
		
		case 12:
		System.out.print(a + c);
		break;
		
		
	
	
	


}
	
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		