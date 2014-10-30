import java.util.*;

public class Character {
    //Instance Variables
    protected String name;
    protected int hp;
    protected int strength;
    protected int defense;
    protected Random r = new Random();
    protected int attackRating = r.nextInt(100) + 1;
    protected int bullets;
    protected int vests;
    protected String type;
    protected String target;
    protected String charac;
    protected boolean immune;
    protected int id;
    protected Character host;
    protected boolean visiting;

    //Constructors
    public Character(int num) {
	name = "John Johnson";
	id = num;
    }
    public Character(int num, String n) {
	name = n;
	id = num;
    }

    //Methods
    public boolean isAlive() {
	if(hp <= 0) {
	    System.out.println("You are dead.");
	    return false;
	}
	else {
	    return true;
	}
    }
    public String toString() {
	String s = new String();
	s = "Name: " + name;
	s += "\nHealth: " + hp;
	s += "\nStrength: " + strength;
	s += "\nDefense: " + defense;
	s += "\nAttack Rating: " + attackRating;
	return s;
    }

    public void attack(Character c) {
	int damage;
	damage = (int) Math.round(strength * attackRating * 0.01) - c.defense;
	if(damage < 0) {
	    damage = 0;
	}
	c.hp -= damage;
    }
    public void putVest(Character c) {
	if(c.vests > 0) {
	    c.vests--;
	    c.immune = true;
	}
	else {
	    System.out.println("You do not have any bulletproof vests to put on!");
	}
    }
    public void fire(Character c) {
	if(bullets > 0) {
	    bullets--;
	    c.hp = 0;
	}
    }
    public boolean visit(int ID, Character c) {
	return (c.id == ID); 
    }
    
    public void setTarget() {
    	String[] targets = {"Town", "Neutral", "Mafia"};
	Random r = new Random();
	int i = r.nextInt(3);
	target = targets[i];
    }
} 
