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
	hp = 75;
	defense = 7;
	bullets = 3;
	attackRating = 80;
	id = num;
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
    }
}
