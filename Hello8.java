import java.util.Scanner;
class Hello8
{
	public static void main ( String[] args )
	{
		System.out.println("What is your name?");
		
		Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
	
		if(name.equals("Andrew"))
		{
			System.out.println( "Hey! You're not Andrew!!!");
		}
	
		System.out.println( "Hello World 8!(watch out for all the lava and cannons)" ) ;
	}
	public static void decision(int a)
	{
		//I don't really know what I'm doing here.
		System.out.println(int a);
	}
}
