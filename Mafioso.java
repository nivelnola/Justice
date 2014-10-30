public class Mafioso extends Character {
  
  public Mafioso(int num){
    super(num);
    type ="Mafia";
    charac = "Mafioso";
    hp = 75;
    strength = 6;
    defense = 4;
    attackRating = 6;
    bullets = 3;
    id = num;
    }
  
  public Mafioso(int num, String n){
    super(num, n);
    name = n;
    type = "Mafia";
    charac = "Mafioso";
    hp = 75;
    strength = 6;
    defense = 4;
    attackRating = 6;
    bullets = 3;
    id = num;
    }
  
  public String toString(){
    String s = super.toString();
    return s;
    }
    
  public void checkFaction( Character c){ 
    //mafia should be able to know who each other are
    String s;
    if (c.type.equals("Mafia")){
      s = "Mafia";
      }
    else if (c.type.equals("Neutral")) { 
      s = "Neutral";
    }
    else{
      s = "Town";
    }
    System.out.println( c.name + "'s type is " + s);
    }
}
    
