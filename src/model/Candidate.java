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
}