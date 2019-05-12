package ui;
import model.Company;
import model.RecruitmentArea;
import model.Candidate;
import model.Characteristic;
import java.util.scanner;

public class Main{

	private Company company;

//Constructor

	public Main(){

		company = new Company("Company", 3.0);
	}

	public static void main(String []args){

		Main m = new Main();
		main.menu();
	}

	public void menu(){

		Sytem.out.print("Welcome to the software of the company\n");

	    boolean running = true;
		boolean asking = false;
		Scanner reader = new Scanner(System.in);

		while(running){

			System.out.println("Please choose an option pressing the number related with the option do you want:");
			System.out.println("1. Register a new candidate.");
			System.out.println("2. Register a new recruitment area.");
			System.out.println("3. Register a new characteristic.");
			System.out.println("4. modify the threshold of a characteristic.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			String choice = s.nextLine();
			int choiceNum = 0;
			
			try {
				choiceNum = Integer.parseInt(choice);
			} catch(NumberFormatException e) {
				System.out.println("Please enter a number.");
			}
	}
}