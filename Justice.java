//Imports
import java.util.*;

public class Justice {
    ///Instance Variables
    private int members;
    private boolean lose?;
    private boolean win?;
    
    //Methods
    public void generate() {
	
    }
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
	    Vigilante you = new Vigilante(0, nam);
	}
	if (job.equals("Executioner")) {
	    Executioner you = new Executioner(0, nam);
	}
	if (job.equals("Mafioso")) {
	    Mafioso you = new Mafioso(0, nam);
	}
	if (job.equals("Detective")) {
	    Detective you = new Detective(0, nam);
	}
	else () {
		System.out.println("That is not an acceptable job. We are assuming you are a Survivor.");
		Survivor you = new Survivor(0, nam);
	    }
	System.out.println(you);
    }
}
