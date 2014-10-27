public class Consigliere extends Character {
    //Instance Variable
    private String log;

    //Constructors
    public Consigliere(int num) {
	hp = 80;
	strength = 7;
	defense = 5;
	attackRating = 4;
	type = "Mafia";
	log = "LIST OF ROLES";
	id = num;
    }
    public Consigliere(int num, String n) {
	hp = 80;
	strength = 7;
	defense = 5;
	attackRating = 4;
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
