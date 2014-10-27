public class Mafioso{
  
  public Mafioso(){
    type ="Mafia";
    hp = 75;
    strength = 6;
    defense = 4;
    attackRating = 6;
    bullets = 3;
    }
  
  public Mafioso(String n){
    name = n;
    type = "Mafia"
    hp = 75;
    strength = 6;
    defense = 4;
    attackRating = 6;
    bullets = 3;
    }
  
  public String toString(){
    String s = super.tString();
    return s
    }
    
  public void checkFaction( Character c){ 
    //mafia should be able to know who each other are
    String s;
    if (c.type.equals("Mafia")){
      s = "Mafia";
      }
    else if (c.type.equals("Neutral") { 
      s = "Neutral";
    else{
      s = "Town";
    }
    System.out.println( c.name + "'s type is " + s);
    }
    
