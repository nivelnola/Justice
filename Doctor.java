public class Doctor extends Character {
    //Instance Variables                                                        
    protected int xp;

    //Constructors                                                              
    public Doctor(int num) {
	super(num);
        type = "Town";
	charac = "Doctor";
        hp = 100;
        strength = 0;
        defense = 10;
        attackRating = 0;
        xp = 0;
	id = num;
    }
    public Doctor(int num, String n ) {
	super(num, n);
        type = "Town";
	charac = "Doctor";
        hp = 100;
        strength = 0;
        defense= 10;
        attackRating = 0;
        xp = 0;
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
        s += "\nxp: " + xp;
        return s;
    }
    public void heal( Character c ) {
        if (!c.isAlive()) {
            c.hp += 1;
            System.out.println("You revived a dead person: " + c.name);
        }
        else {
            if (c.type.equals("Mafia")) {
                    xp -= 10;
            }
            else {
                c.hp += 30 + xp;
                xp += 30;
            }
        }
    }
}
