package model;
import java.util.ArrayList;

public class Company{

//Attributes

	private String name;
	private double threshold;
	private ArrayList <RecruitmentArea> areas;

//Constructor

	public Company(String name, double threshold){

		this.name = name;
		this.threshold = threshold;
		areas = new ArrayList <RecruitmentArea>();
	}

//Getters

	public String getName(){

		return name;
	}

	public double getThreshold(){

		return threshold;
	}

	public ArrayList <RecruitmentArea> getAreas(){

		return areas;
	}

//Setters

	public void setName(String name){

		this.name = name;
	}

	public void setThreshold(double threshold){

		this.threshold = threshold;
	}

	public void setAreas(ArrayList <RecruitmentArea> areas){

		this.areas = areas;
	}

//Methods

	public void addRecruitmentArea(String geographicalArea){

		areas.add(new RecruitmentArea(geographicalArea));
	}

	public void addCandidate(String id, String fullName, char gender, String geographicalArea){

		for(int i = 0; i < areas.size(); i++){
			
			if(areas.get(i) != null && areas.get(i).getGeographicalArea().equals(geographicalArea)){

			areas.get(i).addCandidate(id, fullName, gender);

			}
		}
	}

	public String showGeographicalAreas(){

		String geographicalAreas = "";

		for(int i = 0; i < areas.size(); i++){

			if(areas.get(i) != null){

				geographicalAreas += areas.get(i).getGeographicalArea() + "\n";
			}
		}

		return geographicalAreas;
	}

	public String reportOfCandidates(){

		String report = "";

		for(int i = 0; i < areas.size(); i++){

			if(areas.get(i) != null){

			report += areas.get(i).reportOfCandidates();
		}
	}

	return report;
}

	public double averagePerCharacteristicAndPerRecruitmentArea(String geographicalArea, String name){

		boolean success = false;
		double average = 0.0; 	

		for(int i = 0; i < areas.size() && success != true; i++){

			if(areas.get(i) != null && areas.get(i).getGeographicalArea().equals(geographicalArea)){

				average = areas.get(i).averagePerCharacteristic(name);
				success = true;
			}
		}

		return average;

	}

	public void addCharacteristic(String id, String name, double qualification){

		boolean success = false;

		for(int i = 0; i < areas.size() && success != true; i++){

			if(areas.get(i) != null){

				if(areas.get(i).addCharacteristic(id, name, qualification) == true){

					success = true;
				}
			}
		}
	}

	public void modifyThreshold(double threshold, String name){

		for(int i = 0; i < areas.size(); i++){

			if(areas.get(i) != null){

				areas.get(i).modifyThreshold(threshold, name);
			}
		}
	}

	public String calculateThePercentegeOfWomen(){

		String average = "";
		double averageDouble = 0.0;
		int numberOfWomen = 0;
		int numberOfCandidates = 0;

		for(int i = 0; i < areas.size(); i++){

			if(areas.get(i) != null){

				numberOfWomen += areas.get(i).calculateTheNumberOfWomen();
				numberOfCandidates += areas.get(i).calculateTheNumberOfCandidates();
			}
		}

		if(numberOfCandidates != 0){
			averageDouble = (numberOfWomen / numberOfCandidates * 100);
		}

		average = averageDouble + "%";
		return average;
	}
	 
	public String calculateTheRecruitmentAreaWithMoreCandidatesOverTheThreshold(){

		int counter = 0;
		boolean success;
		int number1 = 0;
		int number2 = 0;
		String geographicalArea = "";

		for(int i = 0; i < areas.size(); i++){

			if(areas.get(i) != null){

				success = false;
				number1 = areas.get(i).numberOfCandidatesOverTheThreshold(threshold);

				for(int j = i+1; j < areas.size() && success != true; j++){

					if(areas.get(j) != null){

					number2 = areas.get(j).numberOfCandidatesOverTheThreshold(threshold);

					if(number2 > number1){

						geographicalArea = areas.get(j).getGeographicalArea();
						success = true; 
						
						}
					}
				}

			}
		}

		return geographicalArea;
	}

	public double averageOfRecruitmentAreasPerCharacteristic(String name){

		int counter = 0;
		double average = 0.0;

		for(int i = 0; i < areas.size(); i++){

			if(areas.get(i) != null){

				average += areas.get(i).candidatesAveragePerCharacteristic(name);
				counter++;
			}
		}

		average /= counter;
		return counter;
	}

	public void specialFilter(){

		String caracteristic = "Attitude";


	}

	public void filterByAttitude(){

		String name = "Attitude";

		for(int i = 0; i < areas.size(); i++){

			if(areas.get(i) != null){

				areas.get(i).getThresholdOfCharacteristic(name);
			}
		}
	}
	
}
