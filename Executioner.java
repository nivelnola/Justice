import java.util.*;
    
public class Executioner extends Character {

    //Instance variables
    String target;

    //Constructors
    public Executioner(int num) {
	super(num);
	name = "Frankie";
	charac = "Executioner";
	type = "Neutral";
	strength = 30;
	hp = 75;
	defense = 7;
	bullets = 3;
	attackRating = 80;
	id = num;
    }

    public Executioner(int num, String n) {
	super(num, n);
	name = n;
	charac = "Executioner";
	type = "Neutral";
	strength = 30;
	hp = 75;
	defense = 7;
	bullets = 3;
	attackRating = 80;
	id = num;
    }

    //Methods 
    public String setTarget() {
	String[] targets = {"Vigilante", "Detective", "Mafioso", "Survivor", "Doctor", "Shopkeeper", "Godfather"};
	Random r = new Random();
	int i = r.nextInt(7);
	target = targets[i];
	return target;
    }
    
    public void fire(Character c) {
	super.fire(c);
	if (c.charac == target) {
	    System.out.println("You eliminated a " + c.charac + "! Congratulations on completing your task and winning the game.");
	}
	else {
	    System.out.println("You killed a " + c.charac + ". Continue on your mission to find and kill a " + target + ".");
	    
	}
}
}
