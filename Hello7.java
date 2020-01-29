import java.util.Scanner;

class Hello7{
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		System.out.println("What us your name?");
		String userName = input.nextLine();
		
		if (userName.equals("Logan")){
			System.out.println("Hello Owner " + userName);
		}
		else System.out.println("Hello Guest User " + userName);
}
void decision(int a){
		System.out.println(a);
	}
}