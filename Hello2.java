import java.util.Scanner ;
class Hello2
{
	public static void main (String[] args )
	{
	
	Scanner UserInput = new Scanner( System.in) ;

	String Name;
	
	System.out.print(" What is your name? " ) ;
	Name = UserInput.next() ;
	
	
	if (Name.equals("Bryce")) 
	{
		System.out.print("hello Bryce");
	}
	else
	{
		System.out.print("hello user");
	}
	
	
	}
	void Decision(int a) {
		System.out.print(a);
	}
	void Decision(String b)
	{
		System.out.print(b);
	}
	void Decision (int c, String d)
	{
		System.out.print(c,d);
	}
}

		