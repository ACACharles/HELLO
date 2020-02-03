import java.util.*;  
class FeedbackMethod {  

	void decision(int d){
		switch(d){
			case 1:
			System.out.print(1);
			break;
			
			case 2:
			System.out.print(2);
			break;
			
			case 3:
			System.out.print(3);
			break;
			
			case 4:
			System.out.print(4);
			break;
			
			default :
			System.out.print(1);
		}
	}
		
	public static void main(String args[]){  
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter your name: ");  
		String name = in.nextLine(); 
		if(name.equals("Bingus")){
		System.out.println("Hey, I know life is tough sometimes");
		System.out.println("but you're strong and you'll get through this.");
		System.out.println("You're capable of anything, Bingus.");}
		else System.out.println("Name is: " + name);             
		System.out.print("Enter your number: "); 
		int d = in.nextInt(); 
		in.close();
	}
}  