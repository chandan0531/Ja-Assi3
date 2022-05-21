package com.assi3;

public class CheckWeather {
	

	 void weather(boolean isSnowing,boolean isRaining, double temperature) {

		if(isSnowing==true && isRaining==true && temperature<50.0)
		{
			System.out.println("Let's stay home.");
		}
		else
		{
			System.out.println("Let's go out!");
		}
		
	}
	public static void main(String[] args) {
		
		CheckWeather check = new CheckWeather();
		
		check.weather(true, true, 40.0);
	}
}
