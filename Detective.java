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
  public void investigate( Character c) {
  //How to investigate the other character c;
  }
}
