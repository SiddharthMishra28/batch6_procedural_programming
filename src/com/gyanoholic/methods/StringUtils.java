package com.gyanoholic.methods;

public class StringUtils {
	
	/**
	 * <OPTIONAL ACCESS SPECIFIER> <RETURN TYPE> <NAME OF METHOD>(<PARAMETERS / ARGUMENTS>){
	 * LOGIC FOR PROCESSING
	 * }
	 */
	
	int userNameLength(String userName) {
		return userName.length();
	}
	// SID
	int countCharacterInUserName(String userName, char toCount) {
		int count = 0;
		for(int i=0; i<userName.length(); i++) {
			if(userName.charAt(i) == toCount) {
				count++;
			}
		}
		return count;
	}
	
	/***
	 * WRITE A METHOD WITHIN A PROGRAM TO REVERSE STRING FIRST AND COUNT A CHARACTERS POSITION IN IT
	 * I AM GOOD
	 *  
	 */
	int countCharacterPositionInReverseString(String toReverse, char toSearchForPosition) {
		for(int i=toReverse.length()-1; i>0; i--) {
			if(toReverse.charAt(i) == toSearchForPosition) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	public static void main(String[] args) {
		StringUtils utilities = new StringUtils();
//		System.out.println(utilities.userNameLength("Siddharth"));
//		System.out.println(utilities.countCharacterInUserName("Siddharth", 'a'));
		System.out.println(utilities.countCharacterPositionInReverseString("I am good", 'm'));
	}
}
