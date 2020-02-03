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
	public void MakeADecision(int a){

        String Food; 
  
        
        switch (a) { 
        case 1: 
             Food = "I'm eating PIZZA"; 
            break; 
        case 2: 
            Food = "I'm eating BURGER"
			break;
        case 3: 
            Food = "I'm eating SUSHI"; 
            break; 
        case 4: 
            Food = "I'm eating TACOS"; 
            break; 
        case 5: 
            Food = "I'm eating MUFFINS"; 
            break; 
		default: 
            Food = "Put the fork DOWN"; 
            break; 
		
		System.out.println(Food);
	}
	public void MakeADecision(String str){
		System.out.println(str);
	}
	public void MakeADecision(int b String str1){
		System.out.println(b, "str1");
	}
}