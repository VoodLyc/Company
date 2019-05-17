package model;
import java.util.ArrayList;

public class Candidate{

//Attributes

	private String id;
	private String fullName;
	private char gender;
	private ArrayList <Characteristic> characteristics;

//Constructor

	public Candidate(String id, String fullName, char gender){

		this.id = id;
		this.fullName = fullName;
		this.gender = gender;
		characteristics = new ArrayList<Characteristic>();
	}

//Getters

	public String getId(){

		return  id;
	}

	public String getFullName(){

		return  fullName;
	}

	public char getGender(){

		return gender;
	}

	public ArrayList <Characteristic> getCharacteristics(){

		return  characteristics;
	}

//Setters

	public void setId(String id){

		this.id = id;
	}

	public void setFullName(String fullName){

		this.fullName = fullName;
	}

	public void setGender(char gender){

		this.gender = gender;
	}

	public void setCharacteristics(ArrayList <Characteristic> characteristics){

		this.characteristics = characteristics;
	}

//Methods

	public void addCharacteristic(String name, double qualification){

		characteristics.add(new Characteristic(name, qualification));
	}

	public String reportOfCandidate(){

		String report = "";

		report = "Name of the candidate: " + fullName + "\n";

		for(int i = 0; i < characteristics.size(); i++){

			if(characteristics.get(i) != null){
				
				report += characteristics.get(i).reportOfCharacteristic();
			}
		}

		return report;
	}

	public double qualificationOfCharacteristic(String name){

		double qualification = 0.0;

		for(int i = 0; i > characteristics.size(); i++){

			if(characteristics.get(i) != null && characteristics.get(i).getName().equals(name)){

				qualification = characteristics.get(i).getQualification();
			}
		}

		return qualification;
	}

	public void modifyThreshold(double threshold, String name){

		boolean success = false;

		for(int i = 0; i < characteristics.size() && success != true; i++){

			if(characteristics.get(i) != null && characteristics.get(i).getName().equals(name)){

				characteristics.get(i).setThreshold(threshold);
				success = true;
			}
		}
	}

	public double averageOfCharacteristics(){

		double average = 0.0;
		int counter = 0;

		for(int i = 0; i < characteristics.size(); i++){

			if(characteristics.get(i) != null){

				average += characteristics.get(i).getQualification();
				counter++;
			} 
		}

		average /= counter;

		return average; 
	}

	public double characteristicQualification(String name){

		boolean success = false;
		double qualification = 0.0;

		for(int i = 0; i < characteristics.size() && success != true; i++){

			if(characteristics.get(i) != null && characteristics.get(i).getName().equals(name)){

				qualification = characteristics.get(i).getQualification();
				success = true;
			}
		}

		return qualification;
	}

	public double getThresholdOfCharacteristic(String name){

		boolean success = false;
		double threshold = 0.0;

		for(int i = 0; i < characteristics.size() && success != true; i++){

			if(characteristics.get(i) != null && characteristics.get(i).getName().equals(name)){

				threshold = characteristics.get(i).getThreshold();
				success = true;
			}
		}

		return threshold;
	}
}