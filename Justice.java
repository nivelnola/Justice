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
	System.out.println("Job: " + job + " | Name: " + nam);
    }
}
