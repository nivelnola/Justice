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
	Scanner play = new Scanner(System.in);
	while(you.hp > 0 && (win == false || lose == false)) {
	    you.visiting = true;
	    while(you.visiting = true) {
		System.out.println("Who do you want to visit? [1-9]");
		int tochar = play.nextInt();
		if(you.visit(tochar, consig) == true) {
		    you.host = consig;
		}
		else if(you.visit(tochar, det)) {
		    you.host = det;
		}
		else if(you.visit(tochar, doc)) {
		    you.host = doc;
		}
		else if(you.visit(tochar, exec)) {
		    you.host = exec;
		}
		else if(you.visit(tochar, gf)) {
		    you.host = gf;
		}
		else if(you.visit(tochar, maf)) {
		    you.host = maf;
		}
		else if(you.visit(tochar, shp)) {
		    you.host = shp;
		}
		else if(you.visit(tochar, surv)) {
		    you.host = surv;
		}
		else if(you.visit(tochar, vig)) {
		    you.host = vig;
		}
		else {
		    System.out.println("That citizen is nonexistent. Please choose another.");
		    tochar = play.nextInt();
		}
		System.out.println("You are visiting " + you.host.name);
		you.visiting = false;

		Scanner action = new Scanner(System.in);
		if (you.charac == "Vigilante") {
		    System.out.println("Would you like to ATTACK, FIRE, or PUT ON A VEST?)"); 
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
		    if (option.equalsIgnoreCase("put on a vest")) {
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
