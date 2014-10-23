public Survivor extends Character {
  
  //Construtors
  public Survivor() {
    name = "Robinson Cruso";
    hp = 50;
    type = "Neutral";
    defense = 2;
    }
  
  public Survivor( String n ) {
    name = n;
    hp = 50;
    type = "Neutral";
    defense = 2;
  }
  
  //Methods
  public void takeSide() {
    Scanner s = new Scanner( System.in );
    String t;
    System.out.println("Who will you side with? Enter: Mafia/Town");
    t = s.nextLine();
  }
}
