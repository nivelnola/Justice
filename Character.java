public class Character {
    //Instance Variables
    protected String name;
    protected int hp;
    protected int strength;
    protected int defense;
    protected int attackRating;
    protected String type;

    //Constructors
    public Character() {
	name = "John Johnson";
    }
    public Character(String n) {
	name = n;
    }

    //Methods
    public boolean isAlive() {
	if(hp < 0) {
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
    public int attack(Character c) {
	int damage;
	damage = (strength * attackRating) - c.defense;
	if(damage < 0) {
	    damage = 0;
	}
	c.hp -= damage;
	return damage;
    }
}
