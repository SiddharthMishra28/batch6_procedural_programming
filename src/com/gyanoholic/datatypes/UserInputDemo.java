package com.gyanoholic.datatypes;

import java.util.Scanner;

public class UserInputDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // INDICATES THAT WE WISH TO READ VALUES 
		// FROM STANDARD INPUT i.e. KEYBOARD 
		String name;
		String adhaar;
		int age;
		// String user_name
		// int user_age
		// String adhaar
		// if user has valid adhaar - 12 digitis
		// if user > 18 
		// print - "CAN VOTE"
		// print - "CANNOT VOTE"
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Adhaar Number : ");
		adhaar = sc.nextLine();
		System.out.println("Enter Age : ");
		age = Integer.parseInt(sc.nextLine());
		if(adhaar.length() == 12 && age > 18) {
			System.out.println("CAN VOTE!");
		}else {
			System.out.println("CANNOT VOTE!");
		}
		
		// +, - , X ,/ , %
		// CREATE A BASIC CALCULATOR FOR TWO INPUT NUMBERS BY THE USER
	}
}
