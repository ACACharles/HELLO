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
		String inputString;
			switch (a) {
				case 1:  inputString = "Hi";
					break;
				case 2:  inputString = "Hey";
					break;
				case 3:  inputString = "Hello";
					break;
				case 4:  inputString = "Welcome";
					break;
				default: inputString = "Greetings";
					break;
			}
		}
		System.out.println(inputString);
}
		/*
		void decision(String b){
		System.out.println(b);
		}
		void decision(int c, String d){
		System.out.println(int c,String d);
		}
		*/