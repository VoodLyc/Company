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
}