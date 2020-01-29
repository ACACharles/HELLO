abstract class Gladiator {
	
	 String name;
	 int health;
	 boolean youDead = false;
	
	
public Gladiator(String name, int health){
	name = name;
	health = health;
   }
	
public void attack(Gladiator gd) {
	int damage = 10; //damage dealt
	//damage = 10;
	gd.damageTaken(damage);
	
}

public void damageTaken(int damage) {
	if(health - damage <= 0) {
		health = 0;
		youDead = true;
	}
		else{
		health -= damage;	
		}
}
public boolean youDead(){
	return youDead;
	}
}


class Maximus extends Gladiator{
	
	int favor; //favor of the champion!
	
	public Maximus(){
		super("Maximus Decimus Meridius", 98);
		favor = 0;
	}
	
	public void improveFavor(){
		favor++;
	}
	
}

class Enemy extends Gladiator{
	
	public Enemy(){
		super("Tigris of Gaul", 101);
	}
}

class Fight {

     Maximus hero;
	 Enemy villian;

    public static void main(String[] args) {
        Fight game = new Fight();
        game.start();
    }

    public Fight() {
         hero = new Maximus();
         villian = new Enemy();
         
		
    }

    public void start() {
		 
		 //health();
		 //damage();
		 //youDead();
		 
		   //int attack =(health - damage);
		   
		   
        boolean running = true;
        while(running) {
			System.out.println("Hero attacks!");
           		   hero.attack(villian);
            System.out.println("Villian attacks!");
				villian.attack(hero);
            if(villian.youDead()) {
                System.out.println("ARE YOU NOT ENTERTAINED?!");
                running = false;
				hero.improveFavor();
				System.out.println("You have defeated " + villian.name + "!");
			} 
			else if(hero.youDead()) {
                System.out.println("you DEAD :(");
                running = false;
            }
        }
    }
}