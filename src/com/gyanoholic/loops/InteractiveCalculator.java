package com.gyanoholic.loops;

import java.util.Scanner;

public class InteractiveCalculator {
	
	public static void main(String[] args) {
		int num1;
		int num2;
		int option;
		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		while(isRunning) {
			System.out.println("###################################");
			System.out.println("INTERATIVE CALCULATOR");
			System.out.println("###################################");
			System.out.println("Please select an option from below menu:");
			System.out.println("1. Add Two Numbers");
			System.out.println("2. Subtract Two Numbers");
			System.out.println("3. Multiply two Numbers");
			System.out.println("4. Divide Two numbers");
			System.out.println("5. Quit Program");
			option = Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				System.out.println("Enter First Number");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Second Number");
				num2 = sc.nextInt();
				System.out.println("Sum of "+num1+" and "+num2+" is "+(num1+num2));
				break;
			case 2:
				System.out.println("Enter First Number");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Second Number");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("Difference of "+num1+" and "+num2+" is "+(num1-num2));
				break;
				
			case 3:
				System.out.println("Enter First Number");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Second Number");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("Product of "+num1+" and "+num2+" is "+(num1*num2));
				break;
				
			case 4:
				System.out.println("Enter First Number");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Second Number");
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println("Quotient of "+num1+" and "+num2+" is "+(num1/num2));
				break;
				
			case 5:
				System.out.println("Bye!");
				isRunning = false;
			}
		}
	}
}
