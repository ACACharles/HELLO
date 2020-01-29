import java.util.Scanner;
class Hello5
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hello World!");
		System.out.println();
		System.out.println("What is your name? ");
		String name = input.nextLine();
		
		if(name.equals("Philip")){
			System.out.println("Oh wow thats my name too!!!!");
		}
		else 
			System.out.println("Hello " + name + " nice to meet you.");
		}
		
		void decision(int d)
		{
				System.out.println(d);
		}
}