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
		
			void decision(int d){
			switch (d) {
			case 1:
				System.out.println("This is case 1");
			break;
			case 2:
				System.out.println("This is case 2");
			break;
			case 3:
				System.out.println("This is case 3");
			break;
			case 4:
				System.out.println("This is case 4");
			break;
			case 5:
				System.out.println("This is case 5");
			break;
			
			default: System.out.println("This is default");
			
			}
			
		}
				
		void decision(String d)
		{
				System.out.println(d);
		}

		void decision(int id ,String sd)
		{
				System.out.println(id+" "+sd);
		}
		
}
