package ui;
import model.Company;
import model.RecruitmentArea;
import model.Candidate;
import model.Characteristic;
import java.util.Scanner;

public class Main{

	private Company company;

//Constructor

	public Main(){

		company = new Company("Company", 3.0);
	}

	public static void main(String []args){

		Main m = new Main();
		m.menu();
	}

	public void menu(){

		System.out.print("Welcome to the software of the company\n");

	    boolean running = true;
		boolean asking = false;
		Scanner reader = new Scanner(System.in);

		while(running){

			System.out.println("Please choose an option pressing the number related with the option do you want:");
			System.out.println("1. Register a new recruitment area.");
			System.out.println("2. Register a new candidate..");
			System.out.println("3. Register a new characteristic.");
			System.out.println("4. Modify the threshold of a characteristic.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			int choiceNum = 0;
			String choice = reader.nextLine();
			choiceNum = Integer.parseInt(choice);

			switch(choiceNum){

				case 1:

				registerRecruitmentAreaMenu();

				break;

				case 2:

				registerCandidateMenu();

				break;

				case 3:

				registerCharacteristicMenu();

				break;

				case 4:

				modifyThreshold();

				break;

				case 5:


			}
		}
	}

	public void registerRecruitmentAreaMenu(){

			Scanner reader = new Scanner(System.in);

				System.out.println("Please enter the geographical area");
				String geographicalArea = reader.nextLine();

				company.addRecruitmentArea(geographicalArea);

			}

	public void registerCandidateMenu(){

			Scanner reader = new Scanner(System.in);

			System.out.println("Please enter the id of the candidate");
			String id = reader.nextLine();

			System.out.println("Please enter the full name of the candidate");
			String fullName = reader.nextLine();

			char gender = ' ';
			int genderInt = 0;
			boolean running = true;
			while(running){

			System.out.println("Please select the gender of the candidate");
			System.out.println("1. Male");
			System.out.println("2. Female");
			String genderSelection = reader.nextLine();
			genderInt = Integer.parseInt(genderSelection);
			
			switch(genderInt){

				case 1:
				gender = 'M';
				running = false;

				break;

				case 2:
				gender = 'F';
				running = false;

				break;

				default:
					System.out.println("Please enter a valid number");
			}
			}

			System.out.println("Please write the geographical area in  do you want to register the new candidate");
			company.showGeographicalAreas();
			String geographicalArea = reader.nextLine();

			company.addCandidate(id, fullName, gender, geographicalArea);

	}	

	public void registerCharacteristicMenu(){

		Scanner reader = new Scanner(System.in);

		double qualification = 0.0;

		System.out.println("Please enter the id of the candidate you wish to add a characteristic");
		String id = reader.nextLine();

		System.out.println("Please enter the name of the characteristic");
		String name = reader.nextLine();

		System.out.println("Please enter the qualification of the candidate in this characteristic(Use decimals from 0.0 to 5.0)");
		String qualificationselection = reader.nextLine();
		qualification = Double.parseDouble(qualificationselection);

		company.addCharacteristic(id, name, qualification);
	}

	public void modifyThreshold(){

		Scanner reader = new Scanner(System.in);

		double threshold = 0.0;

		System.out.println("Please enter the name of the characteristic to which you want to change the threshold");
		String name = reader.nextLine();

		System.out.println("Please enter the new threshold");
		String thresholdselection = reader.nextLine();
		threshold = Double.parseDouble(thresholdselection);

		company.setThreshold(threshold, name);
	}
}