public class Consigliere extends Character {
    //Instance Variable
    private String log;

    //Constructors
    public Consigliere(int num) {
	super(num);
	hp = 80;
	strength = 20;
	defense = 5;
	attackRating = 40;
	charac = "Consigliere";
	type = "Mafia";
	log = "LIST OF ROLES";
	id = num;
    }
    public Consigliere(int num, String n) {
	super(num, n);
	hp = 80;
	strength = 20;
	defense = 5;
	attackRating = 40;
	charac = "Consigliere";
	type = "Mafia";
	log = "LIST OF ROLES";
	id = num;
    }

    //Methods
    public void search(Character c) {
	String role = new String();
	role = c.getClass().getSimpleName();
	log += "\nName: " + c.name + " | " + "Role: " + role;
	System.out.println(log);
    }
    public void check() {
	System.out.println(log);
    }
}
