//Group members: Alon Levin, Cindy Li, Nicholas Ramkissoon, Jeffrey Zou

//Imports
import java.util.*;

public class Justice {
    ///Instance Variables
    private static boolean lose;
    private static boolean win;
    
    //Methods
    public static void main(String[] args) {
	//Creating a character
	Scanner s = new Scanner(System.in);
	String job;
	String nam;
	System.out.println("Welcome to Salem! You are a newcomer to the this town.");
	System.out.println("What is your job? You can be a Mafioso, a Detective, a Vigilante, or a Survivor.");
	job = s.nextLine();
	System.out.println("What is your name?");
	nam = s.nextLine();
	Character you;
	if(job.equals("Vigilante")) {
	    you = new Vigilante(0, nam);
	    System.out.println("You work for the Town. You must kill all Mafia, but beware of killing your brethren!");
	}
	else if (job.equals("Mafioso")) {
	    you = new Mafioso(0, nam);
	    System.out.println("You work for the Mafia. You must kill all Townies that oppose your order.");
	}
	else if (job.equals("Detective")) {
	    you = new Detective(0, nam);
	    System.out.println("You work for the Town. You must rid your home of your enemies, the Mafia.");
	}
	else if (job.equals("Survivor")) {
	    you = new Survivor(0, nam);
	    System.out.println("You are a Survivor. You must choose your peers and live to see another day.");
	}
	else {
	    System.out.println("That is not an acceptable job. We are assuming you are a Survivor.");
	    you = new Survivor(0, nam);
	}
	System.out.println("Your stats:\n");
	System.out.println(you);
	//Generate
	Consigliere consig = new Consigliere(1, "Tom Hagen");
	Detective det = new Detective(2, "Hercule Poirot");
	Doctor doc = new Doctor(3, "Yuri Zhivago");
	Executioner exec = new Executioner(4, "Sanjuro Kuwabatake");
	Godfather gf = new Godfather(5, "Louis Buchalter");
	Mafioso maf = new Mafioso(6, "John Franzese");
	Shopkeeper shp = new Shopkeeper(7, "William Loman");
	Survivor surv = new Survivor(8, "Robinson Crusoe");
	Vigilante vig = new Vigilante(9, "Robyn Hode");
       	//Play
	Scanner play = new Scanner(System.in);
	while(you.hp > 0 && (win == false || lose == false)) {
	    //Visiting
	    you.visiting = true;
	    while(you.visiting = true) {
		System.out.println("Who do you want to visit? [1-9]");
		int tochar = play.nextInt();
		if(you.visit(tochar, consig) && consig.isAlive()) {
		    you.host = consig;
		}
		else if(you.visit(tochar, det) && det.isAlive()) {
		    you.host = det;
		}
		else if(you.visit(tochar, doc) && doc.isAlive()) {
		    you.host = doc;
		}
		else if(you.visit(tochar, exec) && exec.isAlive()) {
		    you.host = exec;
		}
		else if(you.visit(tochar, gf) && gf.isAlive()) {
		    you.host = gf;
		}
		else if(you.visit(tochar, maf) && maf.isAlive()) {
		    you.host = maf;
		}
		else if(you.visit(tochar, shp) && shp.isAlive()) {
		    you.host = shp;
		}
		else if(you.visit(tochar, surv) && surv.isAlive()) {
		    you.host = surv;
		}
		else if(you.visit(tochar, vig) && vig.isAlive()) {
		    you.host = vig;
		}
		else {
		    System.out.println("That citizen is nonexistent. Please choose another.");
		    int tochar2 = play.nextInt();
		    if(you.visit(tochar2, consig) && consig.isAlive()) {
			you.host = consig;
		    }
		    else if(you.visit(tochar2, det) && det.isAlive()) {
			you.host = det;
		    }
		    else if(you.visit(tochar2, doc) && doc.isAlive()) {
			you.host = doc;
		    }
		    else if(you.visit(tochar2, exec) && exec.isAlive()) {
			you.host = exec;
		    }
		    else if(you.visit(tochar2, gf) && gf.isAlive()) {
			you.host = gf;
		    }
		    else if(you.visit(tochar2, maf) && maf.isAlive()) {
			you.host = maf;
		    }
		    else if(you.visit(tochar2, shp) && shp.isAlive()) {
			you.host = shp;
		    }
		    else if(you.visit(tochar2, surv) && surv.isAlive()) {
			you.host = surv;
		    }
		    else if(you.visit(tochar2, vig) && vig.isAlive()) {
			you.host = vig;
		    }
		    else {
			System.out.println("This is your final warning. If you try to disturb a corpse, you will be forced to leave the town for disrespecting the dead.");
			int tochar3 = play.nextInt();
			if(you.visit(tochar3, consig) && consig.isAlive()) {
			    you.host = consig;
			}
			else if(you.visit(tochar3, det) && det.isAlive()) {
			    you.host = det;
			}
			else if(you.visit(tochar3, doc) && doc.isAlive()) {
			    you.host = doc;
			}
			else if(you.visit(tochar3, exec) && exec.isAlive()) {
			    you.host = exec;
			}
			else if(you.visit(tochar3, gf) && gf.isAlive()) {
			    you.host = gf;
			}
			else if(you.visit(tochar3, maf) && maf.isAlive()) {
			    you.host = maf;
			}
			else if(you.visit(tochar3, shp) && shp.isAlive()) {
			    you.host = shp;
			}
			else if(you.visit(tochar3, surv) && surv.isAlive()) {
			    you.host = surv;
			}
			else if(you.visit(tochar3, vig) && vig.isAlive()) {
			    you.host = vig;
			}
			else {
			    System.out.println("You have been warned. Now face the harsh wilderness, where you will most likely die.");
			    you.hp = 0;
			    System.out.println("You have died in the harsh wilderness after being kicked out of Salem for disrespecting the dead.");
			    lose = true;
			}
		    }
		}
		if(!lose && !win) {
		    System.out.println("You are visiting " + you.host.name);
		    you.visiting = false;
		    //Actions
		    Scanner action = new Scanner(System.in);
		    //Vigilante
		    if (you.charac == "Vigilante") {
			System.out.println("Would you like to ATTACK, FIRE, check your STATS, or PUT on a vest?"); 
			String option = action.nextLine();
			if (option.equalsIgnoreCase("attack")) {
			    you.attack(you.host);
			    if(you.host.type.equals(you.type)) {
				System.out.println("You surprised " + you.host.name + " by attacking him! Why would you do such a thing?");
			    }
			    else {
				System.out.println("You have attacked " + you.host.name + ". Unfortunately, it has attacked back! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("fire")) {
			    if (you.bullets > 0) {
				System.out.println("You have successfuly fired at " + you.host.name + ". He had no time to react as your bullet left the gun.");
				you.fire(you.host);
			    }
			    else {
				System.out.println("You have no bullets! While you were struggling to find something to fire with, " + you.host.name + "has attacked you! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("put")) {
			    if (you.vests > 0) {
				System.out.println("You have put on a vest! You are protected from being attacked by " + you.host.name + ".");
				you.vests--;
			    }
			    else {
				System.out.println("You have no vests to put on. In the time that you took to look for a vest, " + you.host.name + " has attacked you. Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("stats")) {
			    if(you.host.charac.equals("Doctor")) {
				System.out.println("The good doctor offers to heal you. Your stats are now:");
				you.hp += 20;
				System.out.println(you);
			    }
			    else if(you.host.charac.equals("Shopkeeper")) {
				System.out.println("You are suddenly given a handful of different merchandise. Which would you like to purchase, a BULLET or a VEST?");
				String choice = action.nextLine();
				if(choice.equalsIgnoreCase("bullet")) {
				    you.bullets++;
				    System.out.println("You have bought a bullet!");
				}
				else if(choice.equalsIgnoreCase("vest")) {
				    you.vests++;
				    System.out.println("You have bought a vest!");
				}
				else {
				    System.out.println("What was that again?");
				    choice = action.nextLine();
				}
			    }
			    else if(you.host.type.equals(you.type)) {
				System.out.println("Your host allows you to rest for a while. Your stats are now:");
				you.hp += 5;
				System.out.println(you);
			    }
			    else {
				System.out.println("You were ambushed when you least expected it! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else {
			    System.out.println("You seem to be unable to make up your mind, but time is ticking! What do you wish to do?");
			    option = action.nextLine();
			}
			if(you.guilt) {
			    lose = true;
			}
			if(you.hp <= 0) {
			    lose = true;
			}
			else if(consig.hp<=0 && gf.hp<=0 && maf.hp<=0) {
			    win = true;
			}
		    }
		    //Detective
		    if (you.charac == "Detective") {
			System.out.println("Would you like to ATTACK, FIRE, PUT on a vest, check your STATS, or ASK for his type?"); 
			String option = action.nextLine();
		        if (option.equalsIgnoreCase("attack")) {
			    you.attack(you.host);
			    if(you.host.type.equals(you.type)) {
				System.out.println("You surprised " + you.host.name + " by attacking him! Why would you do such a thing?");
			    }
			    else {
				System.out.println("You have attacked " + you.host.name + ". Unfortunately, it has attacked back! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("fire")) {
			    if (you.bullets > 0) {
				System.out.println("You have successfuly fired at " + you.host.name + ". He had no time to react as your bullet left the gun.");
				you.fire(you.host);
			    }
			    else {
				System.out.println("You have no bullets! While you were struggling to find something to fire with, " + you.host.name + "has attacked you! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("put")) {
			    if (you.vests > 0) {
				System.out.println("You have put on a vest! You are protected from being attacked by " + you.host.name + ".");
				you.vests--;
			    }
			    else {
				System.out.println("You have no vests to put on. In the time that you took to look for a vest, " + you.host.name + " has attacked you. Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("stats")) {
			    if(you.host.charac.equals("Doctor")) {
				System.out.println("The good doctor offers to heal you. Your stats are now:");
				you.hp += 20;
				System.out.println(you);
			    }
			    else if(you.host.charac.equals("Shopkeeper")) {
				System.out.println("You are suddenly given a handful of different merchandise. Which would you like to purchase, a BULLET or a VEST?");
				String choice = action.nextLine();
				if(choice.equalsIgnoreCase("bullet")) {
				    you.bullets++;
				    System.out.println("You have bought a bullet!");
				}
				else if(choice.equalsIgnoreCase("vest")) {
				    you.vests++;
				    System.out.println("You have bought a vest!");
				}
				else {
				    System.out.println("What was that again?");
				    choice = action.nextLine();
				}
			    }
			    else if(you.host.type.equals(you.type)) {
				System.out.println("Your host allows you to rest for a while. Your stats are now:");
				you.hp += 5;
				System.out.println(you);
			    }
			    else {
				System.out.println("You were ambushed when you least expected it! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("ask")) {
			    if (you.host.type.equals("Mafia")) {
				System.out.println(you.host.name + " is a member of the Mafia.");
			    }
			    else if (you.host.type.equals("Town")) {
				System.out.println(you.host.name + " is a Townie.");
			    }
			    else {
				System.out.println(you.host.name + " is Neutral.");
			    }
			}
			else {
			    System.out.println("You seem to be unable to make up your mind, but time is ticking! What do you wish to do?");
			    option = action.nextLine();
			}			
			if(you.hp <= 0) {
			    lose = true;
			}
			else if(consig.hp<=0 && gf.hp<=0 && maf.hp<=0) {
			    win = true;
			}
		    }
		    //Mafioso
		    if (you.charac == "Mafioso") {
			System.out.println("Would you like to ATTACK, FIRE, check your STATS, or PUT on a vest?"); 
			String option = action.nextLine();
		        if (option.equalsIgnoreCase("attack")) {
			    you.attack(you.host);
			    if(you.host.type.equals(you.type)) {
				System.out.println("You surprised " + you.host.name + " by attacking him! Why would you do such a thing?");
			    }
			    else {
				System.out.println("You have attacked " + you.host.name + ". Unfortunately, it has attacked back! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("fire")) {
			    if (you.bullets > 0) {
				System.out.println("You have successfuly fired at " + you.host.name + ". He had no time to react as your bullet left the gun.");
				you.fire(you.host);
			    }
			    else {
				System.out.println("You have no bullets! While you were struggling to find something to fire with, " + you.host.name + "has attacked you! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("put")) {
			    if (you.vests > 0) {
				System.out.println("You have put on a vest! You are protected from being attacked by " + you.host.name + ".");
				you.vests--;
			    }
			    else {
				System.out.println("You have no vests to put on. In the time that you took to look for a vest, " + you.host.name + " has attacked you. Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("stats")) {
			    if(you.host.charac.equals("Doctor")) {
				System.out.println("The good doctor offers to heal you. Your stats are now:");
				you.hp += 20;
				System.out.println(you);
			    }
			    else if(you.host.charac.equals("Shopkeeper")) {
				System.out.println("You are suddenly given a handful of different merchandise. Which would you like to purchase, a BULLET or a VEST?");
				String choice = action.nextLine();
				if(choice.equalsIgnoreCase("bullet")) {
				    you.bullets++;
				    System.out.println("You have bought a bullet!");
				}
				else if(choice.equalsIgnoreCase("vest")) {
				    you.vests++;
				    System.out.println("You have bought a vest!");
				}
				else {
				    System.out.println("What was that again?");
				    choice = action.nextLine();
				}
			    }
			    else if(you.host.type.equals(you.type)) {
				System.out.println("Your host allows you to rest for a while. Your stats are now:");
				you.hp += 5;
				System.out.println(you);
			    }
			    else {
				System.out.println("You were ambushed when you least expected it! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else {
			    System.out.println("You seem to be unable to make up your mind, but time is ticking! What do you wish to do?");
			    option = action.nextLine();
			}			
			if(you.hp <= 0) {
			    lose = true;
			}
			else if(vig.hp<=0 && doc.hp<=0 && det.hp<=0) {
			    win = true;
			}
		    }
		    //Survivor
		    if (you.charac == "Survivor") {
			System.out.println("Would you like to ATTACK, FIRE, check your STATS, PUT on a vest, or ALLY yourself with him?"); 
			String option = action.nextLine();
		        if (option.equalsIgnoreCase("attack")) {
			    you.attack(you.host);
			    if(you.host.type.equals(you.type)) {
				System.out.println("You surprised " + you.host.name + " by attacking him! Why would you do such a thing?");
			    }
			    else {
				System.out.println("You have attacked " + you.host.name + ". Unfortunately, it has attacked back! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("fire")) {
			    if (you.bullets > 0) {
				System.out.println("You have successfuly fired at " + you.host.name + ". He had no time to react as your bullet left the gun.");
				you.fire(you.host);
			    }
			    else {
				System.out.println("You have no bullets! While you were struggling to find something to fire with, " + you.host.name + "has attacked you! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("put")) {
			    if (you.vests > 0) {
				System.out.println("You have put on a vest! You are protected from being attacked by " + you.host.name + ".");
				you.vests--;
			    }
			    else {
				System.out.println("You have no vests to put on. In the time that you took to look for a vest, " + you.host.name + " has attacked you. Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("stats")) {
			    if(you.host.charac.equals("Doctor")) {
				System.out.println("The good doctor offers to heal you. Your stats are now:");
				you.hp += 20;
				System.out.println(you);
			    }
			    else if(you.host.charac.equals("Shopkeeper")) {
				System.out.println("You are suddenly given a handful of different merchandise. Which would you like to purchase, a BULLET or a VEST?");
				String choice = action.nextLine();
				if(choice.equalsIgnoreCase("bullet")) {
				    you.bullets++;
				    System.out.println("You have bought a bullet!");
				}
				else if(choice.equalsIgnoreCase("vest")) {
				    you.vests++;
				    System.out.println("You have bought a vest!");
				}
				else {
				    System.out.println("What was that again?");
				    choice = action.nextLine();
				}
			    }
			    else if(you.host.type.equals(you.type)) {
				System.out.println("Your host allows you to rest for a while. Your stats are now:");
				you.hp += 5;
				System.out.println(you);
			    }
			    else {
				System.out.println("You were ambushed when you least expected it! Your stats are now:");
				you.host.attack(you);
				System.out.println(you);
			    }
			}
			else if (option.equalsIgnoreCase("ally")) {
			    if (you.host.type == "Mafia" || you.host.type == "Town") {
				you.type = you.host.type;
				System.out.println("You are now a part of the " + you.type + ".");
			    }
			    else {
				System.out.println("You cannot ally yourself with " + you.host.name);
			    }
			}
			else {
			    System.out.println("You seem to be unable to make up your mind, but time is ticking! What do you wish to do?");
			    option = action.nextLine();
			}			
			if(you.hp <= 0) {
			    lose = true;
			}
			else if(you.type.equals("Mafia") && vig.hp<=0 && doc.hp<=0 && det.hp<=0) {
			    win = true;
			}
			else if(you.type.equals("Town") && consig.hp<=0 && gf.hp<=0 && maf.hp<=0) {
			    win = true;
			}
		    }
		    you.visiting = true;
		}
	    }
	    if(lose) {
		System.out.println("### GAME OVER ###");
	    }
	    if(win) {
		System.out.println("### YOU HAVE WON ###");
	    }
	}
    }
}
