public class Detective extends Character {
  
  //Constructors
  public Detective() {
    name = "Sherlock Homes";
    hp = 125;
    strength = 3;
    defense = 2;
    type = "Town";
  }
  public Detective( String n ) {
    name = n;
    hp = 125;
    strength = 3;
    defense = 2;
    type = "Town";
  }
  
  //Methods
  public void checkType( Character c) {
    if (c.type = "Mafia") {
      System.out.println(c + " is a mafia.");
    }
    else if (c.type = "Town") {
      System.out.println(c + " is a townsperson.");
    }
    else {
      System.out.println( c + " is neutral.");
    }
  }
}
