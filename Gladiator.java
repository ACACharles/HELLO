abstract class Gladiator {
	
	 String name;
	 int health;
	 boolean youDead = false;
     int damage;	
	
public Gladiator(String n, int h,int d){
	name = n;
	health = h;
    damage = d;   
   }
	
public void attack(Gladiator gd) {
	//int damage = 10; //damage dealt
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


class Player extends Gladiator{
	
	int favor; //favor of the champion!
	
	public Player(){
		super("Maximus Decimus Meridius", 98, 20);
		favor = 0;
	}
	
	public void improveFavor(){
		favor++;
	}
	
}

class Enemy extends Gladiator{
	
	public Enemy(){
		super("Tigris of Gaul", 101, 10);
	}
}

class Fight {

     Player hero;
	 Enemy villian;

    public static void main(String[] args) {
        Fight game = new Fight();
        game.start();
    }

    public Fight() {
         hero = new Player();
         villian = new Enemy();
         
		
    }

    public void start() {
		 	   
		   
        boolean running = true;
        while(running) {
			System.out.println("Hero attacks!");
           		   hero.attack(villian);
            System.out.println(villian.name + "'s health = " + villian.health);
			System.out.println("Villian attacks!");
				villian.attack(hero);
				System.out.println(hero.name + "'s health = " + hero.health);
				//hero.SpecialAttack(villian);
				//System.out.println("Hero uses Special attack!");
				//System.out.println(villian.name + "'s health = " + villian.health);
			
			
            if(villian.youDead()) {
                System.out.println("ARE YOU NOT ENTERTAINED?!");
                running = false;
				hero.improveFavor();
				System.out.println("You have defeated " + villian.name + "!");
				System.out.println("You gained " + hero.favor + " favor!");
			} 
			else if(hero.youDead()) {
                System.out.println("you DEAD :(");
                running = false;
            }
        }
    }
}