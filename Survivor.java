public Survivor extends Character {
  
  //Construtors
  public Survivor() {
    name = "Robinson Cruso";
    hp = 50;
    type = "Neutral";
    defense = 2;
    attackRating = (rand.nextInt(100)+1)/100;
    }
  
  public Survivor( String n ) {
    name = n;
    hp = 50;
    type = "Neutral";
    defense = 2;
    attackRating = (rand.nextInt(100)+1)/100;
  }
  
  //Methods
  public void takeSide( //Takes System.in value as a parameter ) {
    //changes the "type" from Neutral -> the side he/she will be on;
    //
  }
