//Imports
import java.util.*;

public class Justice {
    //Methods
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String job;
	String nam;
	System.out.println("Welcome to Salem! You are a newcomer to the this town.");
	System.out.println("What is your job? You can be a Mafioso, a Detective, a Vigilante, an Executioner, or a Survivor.\n");
	job = s.nextLine();
	System.out.println("What is your name?");
	nam = s.nextLine();
	
	if(job.equals("Vigilante")) {
	    	Vigilante you = new Vigilante(nam);
	}
	if (job.equals("Executioner")) {
		Executioner you = new Executioner(nam);
	}
	if (job.equals("Mafioso")) {
		Mafioso you = new Mafioso(nam);
	}
	if (job.equals("Detective")) {
		Detective you = new Detective(nam);
	}
<<<<<<< HEAD
	else () {
		System.out.println("That is not an acceptable job. We are assuming you are a Survivor.");
		Survivor you = new Survivor(nam);
	    }
=======
>>>>>>> origin/master
	System.out.println(you);
    }
}
