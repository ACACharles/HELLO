import java.util.Scanner;
class Hello3
{	 
    public static void main ( String[] args ) {
	int Vaccine;
	Scanner userInput = new Scanner(System.in);
	System.out.println("What is your name?: ");
	String str = userInput.nextLine();
		
			if(str.equals("David")) 
			System.out.println("Hello " + str + " Password Accepted. Welcome To The Matrix."); 
			 else 
			 System.out.println("Password DENIED! You have been infected with the T Virus. You will die in:"); 
				
		try 
		{	
			Thread.sleep(2000);
			System.out.println("\007");
			System.out.println(3);
			Thread.sleep(2000);
			System.out.println("\007");
			System.out.println(2);
            Thread.sleep(2000);
			System.out.println("\007");
			System.out.println(1);
			Thread.sleep(2000);
			System.out.println("J/K HELLO " + str +" I'll Give You One Shot For The Vaccine. Good Luck.");
        } 
		catch (InterruptedException ie)
        {
            System.out.println("...");
		}	
	}
	
			
	public void Decision(int a) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Pick a number between 1 -5 get it right and you get to live!");
		a = userInput.nextInt();
		switch(a) {
			case 1 : case 2: case 4: case 5: default:
				System.out.println("Wrong Number No Vaccine For You. Now You Are Dead."); break;
			case 3:
				System.out.println("Congratulations You Get To Live Another Day. Here is the Vaccine to the T Virus.");
		}	
	}	
	

	public void Decision(String umbrellaCorp) {
		System.out.println(umbrellaCorp);
	}	
	
	public void Decision(int b, String raccoonCity) {
		System.out.println(b);
		System.out.println(raccoonCity);
	}	
}

