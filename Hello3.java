import java.util.Scanner;
class Hello3
{	 
    public static void main ( String[] args ) {
	
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
			System.out.println("J/K HELLO " + str +"!");
        } 
		catch (InterruptedException ie)
        {
            System.out.println("...");
				}
			}
			
	public void Decision(int a) {
		System.out.println(a);
	}	
	
	public void Decision(String umbrellaCorp) {
		System.out.println(umbrellaCorp);
	}	
	
	public void Decision(int b, String raccoonCity) {
		System.out.println(b);
		System.out.println(raccoonCity);
	}	
}
