import java.util.Scanner;
class Hello
{
	public static void main ( String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println( "Hello Neighbor! :D" ) ;
		System.out.print("What is your name?  ");
			
		String name = userInput.nextLine();
		if(name.equals("Zach")){
			System.out.println("BEEP BOOP BEEP");
			System.out.println("\007");
			}
			else
			System.out.println("DDOS INCOMING " + name + "! My name is Zach!" +
				" Here's a cookie! 01000011 01101111 01101111 01101011 01101001 01100101");
						
				
	}
	public void MakeADecision(int A){
		System.out(A);
	}
	
}