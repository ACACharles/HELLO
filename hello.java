import java.util.Scanner;
class Hello
	{
	void decision(int a){
		System.out.println(a);
	}
		
		public static void main ( String[] args )
	{
		int Prince = 1999;
		Scanner input = new Scanner(System.in);
		System.out.println("But tonight Im gonna party like its...");
		if(input.nextInt() == Prince){
			System.out.println("Access Granted");
			System.out.println( "Hello World!" );
		}else{
			System.out.println("Access Denied");
			System.out.println("Not a Prince fan huh?");
		}
		
	}
}
