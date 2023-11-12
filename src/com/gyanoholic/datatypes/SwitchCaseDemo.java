package com.gyanoholic.datatypes;

public class SwitchCaseDemo {
	
	/**
	 * "134".toCharArray() - [1,3,4]
	 * 1 - * 1
	 * 3 - * 10
	 * 4 - * 100
	 * + - 134
	 * 12 - 
	 * 22-24
	 * 
	 * switch(btn_type) {
	 * 	"INTEGER":
	 * 		changeChannelAsPerButtons()
	 * }
	 */
	public static void main(String[] args) {
		int input_pressed = 3;
		switch(input_pressed) {
			case 2:
				System.out.println("NETFLIX!");
				break;
			case 3:
				System.out.println("AMAZON PRIME");
				break;
		}
	}
}
