public class Shopkeeper extends Character {

    //Constructors 
    public Shopkeeper(int num) {
	super(num);
	name = "Oaken";
	hp = 50;
	type = "Neutral";
	defense = 2;
	vests = 5;
	bullets = 4;
	id = num;
    }
    
    public Shopkeeper(int num, String n) {
	super(num, n);
	name = n;
	hp = 50;
	type = "Neutral";
	defense = 2;
	vests = 5;
	bullets = 4;
	id = num;
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
