import java.util.Scanner;
class Hello{
	
	
	void decision(int a){
		
		int decision = a, salutation = 15, greeting = 42;
		
		switch ( decision ){
		case 2: case 4: case 6: case 8: greeting = 40; break;
		
		case 1: greeting = (salutation % 3 == 2) ? 26:38;
			
		System.out.println(decision + salutation + greeting);
		System.out.println(a);
		}
	}
	void decision(int b, int c, char one){
		System.out.println(b);
	}
	void salutation(int d){
		System.out.println(d);
	}
	void greeting(int d, int a){
		System.out.println(d + a);
	}
	
	
		
	

		public static void main ( String[] args )
	{
		int Prince = 1999;
		Scanner input = new Scanner(System.in);
		System.out.println("But tonight I'm gonna party like its...");
		if(input.nextInt() == Prince){
			System.out.println("Access Granted");
			System.out.println( "Hello World!" );
		}else{
			System.out.println("Access Denied");
			System.out.println("Not a Prince fan huh?");
		}
		
	}	
}