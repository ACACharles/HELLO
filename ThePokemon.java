class Pokemon {
	
	boolean isMale = true;
	double weight, height;
	
	Pokemon(double w, double h){
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
			System.out.println("Your pokemon is male. He got lots of testosterone.");
		else 
			System.out.println("Your Pokemon is female. Mistakes were made. :)");
		
	}
	
	
	void showPokemon() {
		System.out.println("Your pokemon is " + weight + " lbs fat and " + height + " feet short." );
	}
	
}

class PokemonType extends Pokemon {
	String color;
	String type;
	String name;
	
	
	void showPokemon() {
		showPokemonColor();
		super.showPokemon();
	}
	
	PokemonType(String c, double w, double h){
		super(w, h);
		
		color = c;
	}
	
	PokemonType(String t, String n, String c, double w, double h, boolean gender) {
		super(w, h, gender);
		type = t;
		name = n;
		color = c;
		
	}
	
	
	
	void showPokemonColor() {
		System.out.println("         " + name );
		System.out.println("Holy your pokemon is a " + type + " type.");
		System.out.println("Your pokemon color is " + color + ". Damn thats ugly!");
		
	}
}

class ThePokemon {
	public static void main(String args[]){
		
		PokemonType pokemon1 = new PokemonType("fire", "CHARMANDER", "Orange", 19, 2, true);
		
		
		
		
		System.out.println("Pokedex info for: ");
		
		pokemon1.showPokemon();
		pokemon1.pokemonGender(pokemon1.isMale);
	}
}