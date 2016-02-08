package com.google.training.helloworld;

public class CalcClass {
	
	public CalcClass(double a, double b) {
		super();
		this.rez = a+b;
	}
	
	public double getResult(){
		return this.rez;
	}

	public double rez=0;
	
}
