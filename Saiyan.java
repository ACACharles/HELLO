class Saiyan { // Superclass called Saiyans a.k.a Dem Monkey Boyz
	private int power;
	private int speed;
	private String ability;
	
	Saiyan () { // Creates a method called Saiyan() for the subclasses
		power = speed = 0; 
		ability = "Warrior";
	}
	Saiyan (int p, int s, String w){ //Constructor for Saiyan
		power = p ;
		speed = s ;
		ability = w;
	}	
	Saiyan( int p, String w){ //Forgot what this does for lines 15, 52, and 75
		power = speed = p;
		ability = w;
	}
	Saiyan(Saiyan ob) { // Creating an object called Saiyan
		power = ob.power;
		speed = ob.speed;
		ability = ob.ability;
	}
	
	int getPower(){ return power;} 
	int getSpeed(){return speed;} 	//Gets and sets for subclasses of Saiyan to inherit
	void setPower(int p){power = p;}
	void setSpeed(int s){speed = s;}
	
	String getAbility() {return ability;}
	
	void showLevel() {
		System.out.println("Power and speed are " +
							power + "and" + speed);
	}
	int anger() { // Method to be overriden by subclasses of Saiyan
		System.out.println("THE PRINCE OF ALL SAIYANS!");
		return 250000; // Anger method "anger()" returns an int value instantiated on this line
	}
	int Monkey(){
		System.out.println("SHOCK THE MONKEY!!!");
		return 0;
	}	
	int SuperSaiyan(){
		System.out.println("BRING IT ON!");
		return 0;
	}
}
class Goku extends Saiyan { // Goku creates an instance of Saiyan
	private String stance;
	Goku(){ // Method called Goku
		super();
		stance = "none";
	}
	Goku(String a, int p, int s) { // Constructor for Goku's power, speed, and ability
		super(p, s, "Goku");
		
		stance = a;
	}
	Goku(int x) { //?
		super(x, "Goku");
		
		stance = "kaio-ken";
	}
	Goku(Goku ob) { // Goku object 
		super(ob);
		stance = ob.stance;
	}
	int anger() { // Method to be overridden
		return getPower() * getSpeed() * 2;
	}
	void showStyle() {
		System.out.println("Goku is " + stance);
	}
	int Monkey(){
		System.out.println("Does nothing.");
		return 0;
	}
}
class Gohan extends Saiyan{
		Gohan() { // Method called Gohan
			super();
		}
		Gohan(int p, int s){ // Constructor for Gohan
			super(p, s, "Gohan");
		}
		Gohan(int x) { //?
			super(x, "Gohan");
		}
		Gohan(Gohan ob) { // Object Gohan
			super (ob);
		}
		boolean isMonkey(){
			if(getPower()==getSpeed()) return true; // Boolean statement that I couldnt get to work
			return false;							// because somebody has gotta turn into a monkey.
		}
		int anger() { //Overriden method from Saiyan superclass
			return getPower() * getSpeed();
		}
		int Monkey(){
			return getPower() * getSpeed() * 8;
		}
}
class Vegeta extends Saiyan{
		Vegeta(){
			super();
		}
		Vegeta(int p, int s){
			super(p, s, "Vegeta");
		}
		Vegeta(int x){
			super(x, "Vegeta");
		}
		Vegeta(Vegeta ob){
			super (ob);
		}
		int anger(){
			return getPower() * getSpeed() * 4;
		}
		int SuperSaiyan(){
			return getPower() * getSpeed() * 10;
		}
}	
class SuperSaiyans {
	
	public static void main(String args[]) {
		Saiyan fighter[] = new Saiyan [3]; // Creates an array of 3 Saiyans
		
		fighter [0] = new Goku ("kaio-ken" , 2000, 90);
		fighter [1] = new Gohan (2000, 90);
		fighter [2] = new Vegeta (2000,90);
	
		for(int i = 0; i <fighter.length; i++){
			System.out.println("Saiyan is " + fighter[i].getAbility());
			System.out.println("Power is " +fighter[i].anger());
			System.out.println();
		}
			System.out.println("Gohan went MONKEY!!!!");
			System.out.println("Power is now " +fighter[1].Monkey());
			System.out.println("The Earth shakes...");
			System.out.println("Vegeta went SUPER SAIYAN!!!");
			System.out.println("Power is now "+fighter[2].SuperSaiyan());
	}
}