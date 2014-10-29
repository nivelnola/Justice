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
    protected boolean immune;
    protected int id;
    protected Character host;

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
	    System.out.println("You have fired a bullet at " + c.name);
	}
    }
    public boolean visit(int ID, Character c) {
	return (c.id == ID);
    }
    public void go() {
	System.out.println("Who do you want to visit? [1-9]");
	int goto;
	goto = play.nextInt();
	while(visit = true) {
	    if(this.visit(goto, consig) == true) {
		this.host = consig;
	    }
	    else if(this.visit(goto, det)) {
		this.host = det;
	    }
	    else if(this.visit(goto, doc)) {
		this.host = doc;
	    }
	    else if(this.visit(goto, exec)) {
		this.host = exec;
	    }
	    else if(this.visit(goto, gf)) {
		this.host = gf;
	    }
	    else if(this.visit(goto, maf)) {
		this.host = maf;
	    }
	    else if(this.visit(goto, shp)) {
		this.host = shp;
	    }
	    else if(this.visit(goto, surv)) {
		this.host = surv;
	    }
	    else if(this.visit(goto, vig)) {
		this.host = vig;
	    }
	    else {
		System.out.println("That citizen is nonexistent. Please choose another.");
		goto = play.nextInt();
	    }
	    System.out.println("You are visiting " + you.host.name);
	    visit = false;
	}
    }
}
