package com.unittest.testing;

public class Fahrenheit {
	private double celcius;
	private double fahrenheit;
	
	public double getCelcius() {
		return celcius;
	}

	public double getFahrenheit() {
		calculate();
		return fahrenheit;
	}
	public void input(double celcius) {
		
		 this.celcius = celcius;
		
	}
	public void calculate() {
		double celcius = this.getCelcius();
		double fahrenheit = celcius*9/5+32;
		this.fahrenheit = fahrenheit; 
	}
	public boolean isBound(double celcius) {
		boolean isResult;
		if(celcius >=-1000 && celcius <= 1000) {
			isResult = true;
		}
		else {
			isResult =false;
		}
		return isResult;
	}
	@Override
	public String toString() {
		double fahrenheit = this.getFahrenheit();
		double celcius = this.getCelcius();
		return Math.round(celcius)+" celcius = "+Math.round(fahrenheit)+" fahrenheit";
	}
}

