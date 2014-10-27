public class Godfather extends Character{

    public Godfather(int num){
	hp = 100;
	strength = 8;
	defense = 7;
	attackRating = 6;
	bullets = 5;
	type = "Mafia";
	id = num;
	    }

    public Godfather(int num, String n){
	name = n;
	hp = 100;
	strength = 8;
	defense = 7;
	attackRating = 6;
	bullets = 5;
	type = "Mafia";
	id = num;
	    }
 
    public String toString(){
	String s = super.toString();
	return s;
	    }
}

 
