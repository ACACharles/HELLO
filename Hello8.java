import java.util.Scanner;

class Hello8 {
	public static void main(String[] args) {
		System.out.println("What is your name?");

		Scanner input = new Scanner(System.in);

		String name = input.nextLine();

		if (name.equals("Andrew")) {
			System.out.println("Hey! You're not Andrew!!!");
		}

		System.out.println("Hello World 8!(watch out for all the lava and cannons)");
	}

	public static void decision(int a)
	{
		switch(a)
		{
			case 1: System.out.print("This is case 1"); break;
			case 2: System.out.print("This is case 2"); break;
			case 3: System.out.print("This is case 3"); break;
			case 4: System.out.print("This is case 4"); break;
			case 5: System.out.print("This is case 5"); break;
			default : System.out.print("This is not a case"); break;
		}
	}

	public static void decision(int a, b)
	{
		//I still don't really know what I'm doing here.
		System.out.println(a, b);
	}
}
