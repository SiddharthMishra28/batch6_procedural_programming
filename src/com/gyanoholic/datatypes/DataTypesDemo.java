package com.gyanoholic.datatypes;

public class DataTypesDemo {
	
	// PRIMITIVE DATA TYPES
	int roll_no = 12; // 4 bytes
	float dollar_amount = 83.34f; // 4 bytes
	double years_of_experience = 12;
	char c = 'a'; // 2 bytes
	boolean isTrue = false;
	long timestamp = 12345566; // 8 bytes
	short s = 23;
	
	// NON PRIMITIVE / DERIVED DATA TYPE
	// Screen - Resolution (1920, 1080) - Integers
	// Button - states - boolean (on / off)
	// Camera - Resolution - megapixels (12MP - Integer)
	
	// Phone - Camera, Screen, Buttons, Simcard
	// Classes, Arrays
	String name = "Siddharth Mishra";
	
	public static void main(String[] args) {
		// CONCATENATE DIFFERENT DATA TYPES AND PRINT TO CONSOLE
		// USE syso keyboard shortcuts to generate print statements 
		// by eclipse
		char a = 'a';
		int roll = 34;
		long time = 123432432;
		boolean isTrue = false;
		System.out.println(a+" "+roll+" "+time+" "+isTrue);
		
		
	}
}
