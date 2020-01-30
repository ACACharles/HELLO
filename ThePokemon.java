import java.util.Scanner;
class Pokemon {
	
boolean isMale = true;
double weight, height;
	
	Pokemon(double w, double h) {
		weight = w;
		height = h;
	}
	
	Pokemon(double w, double h, boolean gender) {
		weight = w;
		height = h;
		isMale = gender;
	}
		
	void pokemonGender(boolean isMale) {
		if(isMale)
			System.out.println("Your pokemon is male. He got lots of testosterone.\n");
		else 
			System.out.println("Your Pokemon is female. Mistakes were made. :)");	
	}
	
	String pokemonBerry() {
		Scanner userInput = new Scanner(System.in);
		String Input = userInput.nextLine();
		return Input;
	}
	
	
	void showPokemon() {
		System.out.println("Your pokemon is " + weight + " lbs fat and " + height + " feet short." );
	}
}

class PokemonType extends Pokemon {
String color;
String type;
String name;
String response;
	
	void showPokemon() {
		showPokemonColor();
		super.showPokemon();
	}
	
	PokemonType(String t, String n, String c, double w, double h) {
		super(w, h);
		type = t;
		name = n;
		color = c;
	}
	
	PokemonType(String t, String n, String c, double w, double h, boolean gender) {
		super(w, h, gender);
		type = t;
		name = n;
		color = c;
	}
	
	String pokemonBerry() {
		System.out.println("Uh Oh Your " + name + " looks angry. Would you like to feed it a berry?  Yes Or No. (yes is  highly recommended)");
		System.out.println();
		String response  = super.pokemonBerry();		
		pokemonBerry(response);
		return response;
		
	}
	
	void pokemonBerry(String b )	{
		response = b;
		if(response.equals("Yes"))
			System.out.println("Your " + name + " looks happy and unwilling to harm you. Yay.");
		else
			System.out.println("Oh Boy Your " + name  +" blacked out in a fit of rage and killed you. Game Over.");
	}
			
	void showPokemonColor() {
		System.out.println("         " + name );
		System.out.println("Holy your pokemon is a " + type + " type.");
		System.out.println("Your pokemon color is " + color + ". Damn thats ugly!");
	}
}


class ThePokemon {
	public static void main(String args[]){
		
		pokemonCatching catching = new pokemonCatching();
		PokemonType pokemon1 = new PokemonType("fire", "CHARMANDER", "Orange", 19, 2, true);
		PokemonType pokemon2 = new PokemonType("normal", "DITTO", "Purple", 8.8, 1);
		
		catching.pokemonCatching();
		
		System.out.println("Pokedex info for: ");
		System.out.println();
		pokemon1.showPokemon();
		pokemon1.pokemonGender(pokemon1.isMale);
		
		pokemon1.pokemonBerry();
		
		
		
	}
}