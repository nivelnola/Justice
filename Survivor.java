//Imports
import java.util.*;

public class Survivor extends Character {
  
  //Construtors
  public Survivor(int num) {
    super(num);
    name = "Robinson Crusoe";
    hp = 50;
    type = "Neutral";
    defense = 9;
    id = num;
    }
  
  public Survivor(int num,  String n ) {
    super(num, n);
    name = n;
    hp = 50;
    type = "Neutral";
    defense = 9;
    id = num;
  }
  
  //Methods
  public void takeSide() {
    Scanner s = new Scanner( System.in );
    String t;
    System.out.println("Who will you side with? Enter: Mafia/Town");
    t = s.nextLine();
    this.type = t;
  }
}
