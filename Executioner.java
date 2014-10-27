import java.util.*;
    
public class Executioner extends Character {

    //Instance variables
    String target;

    //Constructors
    public Executioner() {
	name = "Frankie";
	type = "Neutral";
	hp = 75;
	defense = 7;
	bullets = 3;
	attackRating = 80;
    }

    public Executioner(String n) {
	name = n;
	type = "Neutral";
	hp = 75;
	defense = 7;
	bullets = 3;
	attackRating = 80;
    }

    //Methods 
    public void setTarget() {
	String[] targets = {"Vigilante", "Detective", "Mafioso", "Survivor", "Doctor", "Shopkeeper", "Godfather"};
	Random r = new Random();
	int i = r.nextInt(7);
	target = targets[i];
    }
    
    public void attack(Character c) {
	super.attack(c);
	if (c.type.equals(target)) {
	    System.out.println("You eliminated a" + c.type + "! Congratulations on completing your task and winning the game.");
	}
	else {
	    System.out.println("You killed a " + c.type + ". Continue on your mission to find and kill a " + target + ".");
	}
    }
}
