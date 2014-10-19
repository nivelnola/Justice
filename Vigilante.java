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
    public void fire(Character c) {
	bullets--;
	c.hp = 0;
	System.out.println("You have fired a bullet at " + c.name);
	if(c.type.equals("Type")) {
	    guilt = true;
	    System.out.println("You have killed a fellow Town member!\nYou are overcome by a deadly sense of guilt.");
	}
    }
    public void suicide() {
	if(guilt) {
	    hp=0;
	    System.out.println("You cannot live with this guilt anymore. You decide that there is only one solution.");
	}
	else {
		System.out.println("Shooting yourself sounds like a pretty stupid thing to do.");
	    }
    }
}
