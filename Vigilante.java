public class Vigilante extends Character {
    //Instance Variables
    protected boolean guilt;

    //Constructors
    public Vigilante(int num) {
	super(num);
	type = "Town";
	charac = "Vigilante";
	bullets = 3;
	hp = 75;
	strength = 25;
	defense = 3;
	attackRating = 50;
	id = num;
    }
    public Vigilante(int num, String n) {
	super(num, n);
	type = "Town";
	charac = "Vigilante";
	bullets = 3;
	hp = 75;
	strength = 25;
	defense = 3;
	attackRating = 50;
	id = num;
    }

    //Methods
    public String toString() {
	String s = new String();
	s = "Name: " + name;
	s += "\nHealth: " + hp;
	s += "\nStrength: " + strength;
	s += "\nDefense: " + defense;
	s += "\nAttack Rating: " + attackRating;
	s += "\nBullets: " + bullets;
	return s;
    }
    public void fire(Character c) {
	super.fire(c);
	if(c.type.equals("Town")) {
	    guilt = true;
	    System.out.println("You have killed a fellow Town member!\nYou are overcome by a deadly sense of guilt.");
	}
    }
    public void suicide() {
	if(guilt == true) {
	    hp = 0;
	    System.out.println("You cannot live with this guilt anymore. You decide that there is only one solution.");
	}
	else {
		System.out.println("Shooting yourself sounds like a pretty stupid thing to do.");
	    }
    }
}
