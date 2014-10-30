public class Detective extends Character {
  
  //Constructors
  public Detective(int num) {
    super(num);
    name = "Sherlock Homes";
    hp = 125;
    strength = 3;
    defense = 2;
    charac = "Detective";
    type = "Town";
    id = num;
  }
  public Detective( int num, String n ) {
    super(num, n);
    name = n;
    hp = 125;
    strength = 3;
    defense = 2;
    charac = "Detective";
    type = "Town";
    id = num;
  }
  
  //Methods
  public void checkType( Character c) {
    if (c.type.equals("Mafia")) {
      System.out.println(c + " is a mafia.");
    }
    else if (c.type.equals("Town")) {
      System.out.println(c + " is a townsperson.");
    }
    else {
      System.out.println( c + " is neutral.");
    }
  }
}
