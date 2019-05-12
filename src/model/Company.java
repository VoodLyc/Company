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

}
