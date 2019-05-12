package model;

public class Characteristic{

//Attributes

	private String name;
	private double qualification;
	private double threshold;

//Constructor

	public Characteristic(String name){

		this.name = name;
		this.qualification = 0.0;
		this.threshold = 0.0;
	}

//Getters

	public String getName(){

		return name;
	}

	public double getQualification(){

		return qualification;
	}

	public double getThreshold(){

		return  threshold;
	}

//Setters

	public void setName(String name){

		this.name = name;
	}

	public void setQualification(double qualification){

		this.qualification = qualification;
	}

	public void setThreshold(double threshold){

		this.threshold = threshold;
	}
}