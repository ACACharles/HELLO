import java.util.Scanner;
class Hello3
{	 
    public static void main ( String[] args ) {
	
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?: ");
		String str = userInput.nextLine();
		
		
		System.out.println("Hello " + str + " im a nameless computer. Welcome To The Matrix.");
			if(str.equals("Zach")) {
			System.out.println("You have been infected with the T Virus. You will die in:"); 
				
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
			System.out.println("J/K HELLO Zach!");
        } 
		catch (InterruptedException ie)
        {
            System.out.println("...");
				}
			}
			
			
		
	}
	public void Decision(int a) {
		System.out.println(a);
	}	
}
