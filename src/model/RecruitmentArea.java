package model;
import java.util.ArrayList;

public class RecruitmentArea{

//Attributes

	private String geographicalArea;
	private ArrayList <Candidate> candidates;

//Constructor

	public RecruitmentArea(String geographicalArea){

		this.geographicalArea = geographicalArea;
		candidates = new ArrayList <Candidate>();
	}

//Getters

	public String getGeographicalArea(){

		return geographicalArea;
	}

	public ArrayList <Candidate> getCandidates(){

		return candidates;
	}

//Setters

	public void setGeographicalArea(String geographicalArea){

		this.geographicalArea = geographicalArea;
	}

	public void setCandidates(ArrayList <Candidate> candidates){

		this.candidates = candidates;
	}

//Methods

	public void addCandidate(String id, String fullName, char gender){

		candidates.add(new Candidate(id, fullName, gender));
	}

	public String reportOfRecruitmentArea(){

		String report = "";

		report = "Name of the area: " + geographicalArea + "\n";

		for(int i = 0; i < candidates.size(); i++){

			if(candidates.get(i) != null){

			report += candidates.get(i).reportOfCandidate();
		}
	}

		return geographicalArea;
	}

	public double averagePerCharacteristic(Characteristic characteristic){

		int counter = 0;
		double average = 0.0;

		for(int i = 0; i < candidates.size(); i++){

			if(candidates.get(i) != null){

				average += candidates.get(i).qualificationOfCharacteristic(characteristic);

				counter++;
			}
		}

		average = average / counter;

		return average;
	}
}