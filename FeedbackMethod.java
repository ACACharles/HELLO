import java.util.*;  
class ScannerExample {  
	public static void main(String args[]){  
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter your name: ");  
		String name = in.nextLine(); 
		if(name.equals("bingus"))
		System.out.println("YOU'RE NAME BAD");
		else System.out.println("Name is: " + name);             
		in.close();
	}
	void decision(int d){
	System.out.println(d);
	}
}  