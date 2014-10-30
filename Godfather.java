public class Godfather extends Character{

    public Godfather(int num){
	super(num);
	hp = 100;
	strength = 50;
	defense = 4;
	attackRating = 35;
	bullets = 5;
	type = "Mafia";
	id = num;
	    }

    public Godfather(int num, String n){
	super(num, n);
	name = n;
	hp = 100;
	strength = 50;
	defense = 4;
	attackRating = 35;
	bullets = 5;
	type = "Mafia";
	id = num;
	    }
 
    public String toString(){
	String s = super.toString();
	return s;
	    }
}

 
