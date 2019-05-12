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
}
