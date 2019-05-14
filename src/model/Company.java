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

			report += areas.get(i).reportOfRecruitmentArea();
		}
	}

	return report;
}

	public double averagePerCharacteristicandPerRecruitmentArea(RecruitmentArea recruitmentArea, Characteristic characteristic){

		double average = 0.0; 	

		for(int i = 0; i < areas.size(); i++){

			if(areas.get(i) != null && areas.get(i).getGeographicalArea().equals(recruitmentArea.getGeographicalArea())){

				average = areas.get(i).averagePerCharacteristic(characteristic);
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

	public void setThreshold(double threshold, String name){

		for(int i = 0; i < areas.size(); i++){

			if(areas.get(i) != null){

				areas.get(i).setThreshold(threshold, name);
			}
		}
	}

}
