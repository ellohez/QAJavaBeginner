package com.qa.stretchExercises;

public class Paint {

	private int numLitres = 0;
	private double costPerLitre = 0.00;
	private int coverage = 0;
	private String name = "";

	public int getNumLitres() {
		return numLitres;
	}

	public void setNumLitres(int numLitres) {
		this.numLitres = numLitres;
	}

	public double getCostPerLitre() {
		return costPerLitre;
	}

	public void setCostPerLitre(double costPerLitre) {
		this.costPerLitre = costPerLitre;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
