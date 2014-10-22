public class Shopkeeper extends Character {

    //Constructors 
    public Shopkeeper() {
	name = "Oaken";
	hp = 50;
	type = "Neutral";
	defense = 2;
	vests = 5;
	bullets = 4;
    }
    
    public Shopkeeper(String n) {
	name = n;
	hp = 50;
	type = "Neutral";
	defense = 2;
	vests = 5;
	bullets = 4;
    }

    //Methods
    public void giveBullet(Character c) {
	if (bullets > 0) {
	    c.bullets++;
	    bullets--;
	    System.out.println("Here's one bullet. Use it wisely.");
	}
	else {
	    System.out.println("Sorry, I have no more bullets for you. I wish you luck.");
	}
    }

    public void giveVests(Character c) {
	if (vests > 0) {
	    c.vests++;
	    vests--;
	    System.out.println("Take this vest. Be careful out there.");
	}
	else {
	    System.out.println("Sorry, I have no more vests. You're on your own.");
	}
    }
}
