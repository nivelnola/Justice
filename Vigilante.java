public class Vigilante extends Character {
    //Instance Variables
    protected int bullets;
    protected boolean guilt;

    //Constructors
    public Vigilante() {
	super();
	type = "Town";
	bullets = 3;
	hp = 75;
	strength = 5;
	defense = 3;
	attackRating = 6;
    }
    public Vigilante(String n) {
	super(n);
	type = "Town";
	bullets = 3;
	hp = 75;
	strength = 5;
	defense = 3;
	attackRating = 6;
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
