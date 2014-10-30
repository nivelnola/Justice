//Group members: Alon Levin, Cindy Li, Nicholas Ramkissoon, Jeffrey Zou

//Imports
import java.util.*;

public class Justice {
    ///Instance Variables
    private static int members;
    private static boolean lose;
    private static boolean win;
    
    //Methods
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String job;
	String nam;
	System.out.println("Welcome to Salem! You are a newcomer to the this town.");
	System.out.println("What is your job? You can be a Mafioso, a Detective, a Vigilante, an Executioner, or a Survivor.");
	job = s.nextLine();
	System.out.println("What is your name?");
	nam = s.nextLine();
	Character you;
	if(job.equals("Vigilante")) {
	    you = new Vigilante(0, nam);
	}
	else if(job.equals("Executioner")) {
	    you = new Executioner(0, nam);
	    you.setTarget();
	}
	else if (job.equals("Mafioso")) {
	    you = new Mafioso(0, nam);
	}
	else if (job.equals("Detective")) {
	    you = new Detective(0, nam);
	}
	else if (job.equals("Survivor")) {
	    you = new Survivor(0, nam);
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
	members = 9;
	//Play
	Scanner play = new Scanner(System.in);
	while(you.hp > 0 && (win == false || lose == false)) {
	    //Visiting
	    you.visiting = true;
	    while(you.visiting = true) {
		System.out.println("Who do you want to visit? [1-9]");
		int tochar = play.nextInt();
		if(you.visit(tochar, consig) && (consig.hp > 0)) {
		    you.host = consig;
		}
		else if(you.visit(tochar, det) && (det.hp > 0)) {
		    you.host = det;
		}
		else if(you.visit(tochar, doc) && (doc.hp > 0)) {
		    you.host = doc;
		}
		else if(you.visit(tochar, exec) && (exec.hp > 0)) {
		    you.host = exec;
		}
		else if(you.visit(tochar, gf) && (gf.hp > 0)) {
		    you.host = gf;
		}
		else if(you.visit(tochar, maf) && (maf.hp > 0)) {
		    you.host = maf;
		}
		else if(you.visit(tochar, shp) && (shp.hp > 0)) {
		    you.host = shp;
		}
		else if(you.visit(tochar, surv) && (surv.hp > 0)) {
		    you.host = surv;
		}
		else if(you.visit(tochar, vig) && (vig.hp > 0)) {
		    you.host = vig;
		}
		else {
		    System.out.println("That citizen is nonexistent. Please choose another.");
		    tochar = play.nextInt();
		}
		System.out.println("You are visiting " + you.host.name);
		you.visiting = false;
		//Actions
		Scanner action = new Scanner(System.in);
		//Vigilante
		if (you.charac == "Vigilante") {
		    System.out.println("Would you like to ATTACK, FIRE, check your STATS, or PUT on a vest?)"); 
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
			    System.out.println("You have successfuly fired at " + you.host.name + ". He had no time to react as your bullet left the gun.")
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
			    System.out.println("You have no vests to put on. In the time that you took to look for a vest, " + you.host.name + "has attacked you. Your stats are now:");
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
		    you.suicide();
		//Detective
		if (you.charac == "Detective") {
		    System.out.println("Would you like to ATTACK, FIRE, PUT on a vest, or ASK for his type?)"); 
		    String option = action.nextLine();
		    if (option.equalsIgnoreCase("attack")) {
			you.attack(you.host);
			System.out.println("You have attacked " + you.host.name + ". Unfortunately, it has attacked back! Your stats are now:");
			you.host.attack(you);
			System.out.println(you);
		    }
		    if (option.equalsIgnoreCase("fire")) {
			if (you.bullets > 0) {
			    System.out.println("You have successfuly fired at " + you.host.name + ". Unfortunately, it has attacked you! Your stats are now:");
			    you.fire(you.host);
			    you.host.attack(you);
			    System.out.println(you);
			}
			else {
			    System.out.println("You have no bullets! While you were struggling to find something to fire with, " + you.host.name + "has attacked you! Your stats are now:");
			    you.host.attack(you);
			    System.out.println(you);
			}
		    }
		    if (option.equalsIgnoreCase("put")) {
			if (you.vests > 0) {
			    System.out.println("You have put on a vest! You are protected from further attacks from " + you.host.name + ".");
			}
			else {
			    System.out.println("You have no vests to put on. In the time that you took to look for a vest, " + you.host.name + "has attacked you. Your stats are now:");
			    you.host.attack(you);
			    System.out.println(you);
			}
		    }
		    if (option.equalsIgnoreCase("ask")) {
			if (you.host.type.equals("Mafia")) {
			    System.out.println(you.host.name + " is a mafia.");
			}
			else if (you.host.type.equals("Town")) {
			    System.out.println(you.host.name + " is a townsperson.");
			}
			else {
			    System.out.println(you.host.name + " is neutral.");
			}
		    }
		}
		//Mafioso
		if (you.charac == "Mafioso") {
		    System.out.println("Would you like to ATTACK, FIRE, or PUT on a vest?)"); 
		    String option = action.nextLine();
		    if (option.equalsIgnoreCase("attack")) {
			you.attack(you.host);
			System.out.println("You have attacked " + you.host.name + ". Unfortunately, it has attacked back! Your stats are now:");
			you.host.attack(you);
			System.out.println(you);
		    }
		    if (option.equalsIgnoreCase("fire")) {
			if (you.bullets > 0) {
			    System.out.println("You have successfuly fired at " + you.host.name + ". Unfortunately, it has attacked you! Your stats are now:");
			    you.fire(you.host);
			    you.host.attack(you);
			    System.out.println(you);
			}
			else {
			    System.out.println("You have no bullets! While you were struggling to find something to fire with, " + you.host.name + "has attacked you! Your stats are now:");
			    you.host.attack(you);
			    System.out.println(you);
			}
		    }
		    if (option.equalsIgnoreCase("put")) {
			if (you.vests > 0) {
			    System.out.println("You have put on a vest! You are protected from further attacks from " + you.host.name + ".");
			}
			else {
			    System.out.println("You have no vests to put on. In the time that you took to look for a vest, " + you.host.name + "has attacked you. Your stats are now:");
			    you.host.attack(you);
			    System.out.println(you);
			}
		    }
		}
		//Survivor
		if (you.charac == "Survivor") {
		    System.out.println("Would you like to ATTACK, FIRE, PUT on a vest, or ALLY yourself with him?)"); 
		    String option = action.nextLine();
		    if (option.equalsIgnoreCase("attack")) {
			you.attack(you.host);
			System.out.println("You have attacked " + you.host.name + ". Unfortunately, it has attacked back! Your stats are now:");
			you.host.attack(you);
			System.out.println(you);
		    }
		    if (option.equalsIgnoreCase("fire")) {
			if (you.bullets > 0) {
			    System.out.println("You have successfuly fired at " + you.host.name + ". Unfortunately, it has attacked you! Your stats are now:");
			    you.fire(you.host);
			    you.host.attack(you);
			    System.out.println(you);
			}
			else {
			    System.out.println("You have no bullets! While you were struggling to find something to fire with, " + you.host.name + "has attacked you! Your stats are now:");
			    you.host.attack(you);
			    System.out.println(you);
			}
		    }
		    if (option.equalsIgnoreCase("put")) {
			if (you.vests > 0) {
			    System.out.println("You have put on a vest! You are protected from further attacks from " + you.host.name + ".");
			}
			else {
			    System.out.println("You have no vests to put on. In the time that you took to look for a vest, " + you.host.name + "has attacked you. Your stats are now:");
			    you.host.attack(you);
			    System.out.println(you);
			}
		    }
		    if (option.equalsIgnoreCase("ally")) {
			if (you.host.type == "Mafia" || you.host.type == "Town") {
			    //////////////////////////////
			    //////////////////////////////
			    ////// USE NEW VARIABLE //////
			    //////////////////////////////
			    //////////////////////////////
			}
			else {
			    System.out.println("You cannot ally yourself with " + you.host.name);
			}
		    }
		}
		//Executioner
		if (you.charac == "Executioner") {
		    System.out.println("Would you like to ATTACK, FIRE, or PUT on a vest?)"); 
		    String option = action.nextLine();
		    if (option.equalsIgnoreCase("attack")) {
			you.attack(you.host);
			System.out.println("You have attacked " + you.host.name + ". Unfortunately, it has attacked back! Your stats are now:");
			you.host.attack(you);
			System.out.println(you);
		    }
		    if (option.equalsIgnoreCase("fire")) {
			if (you.bullets > 0) {
			    System.out.println("You have successfuly fired at " + you.host.name + ". He had no time to react as the bullet left your gun.");
			    you.fire(you.host);
			}
			else {
			    System.out.println("You have no bullets! While you were struggling to find something to fire with, " + you.host.name + "has attacked you! Your stats are now:");
			    you.host.attack(you);
			    System.out.println(you);
			}
		    }
		    if (option.equalsIgnoreCase("put")) {
			if (you.vests > 0) {
			    System.out.println("You have put on a vest! You are protected from further attacks from " + you.host.name + ".");
			}
			else {
			    System.out.println("You have no vests to put on. In the time that you took to look for a vest, " + you.host.name + "has attacked you. Your stats are now:");
			    you.host.attack(you);
			    System.out.println(you);
			}
		    }
		}
	    }
	}
    }
}
