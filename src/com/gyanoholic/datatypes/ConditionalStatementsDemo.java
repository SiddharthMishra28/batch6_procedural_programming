package com.gyanoholic.datatypes;

public class ConditionalStatementsDemo {
	// if, else, else if
	// switch case
	// if(<CONDITION>) {
	// ....
	// }
	
	public static void main(String[] args) {
		// customer_type = GOLD, PLATINUM
		// reward_points = 1000 - 50 reward points
		// total_amount = ?
		// if reward_points > 250 & customer_type = GOLD - 8% discount
		// if reward_points > 350 & customer_type = PLATINUM - 15% discount
		// other scenarios - no discount
		int total_amount = 10000;
		String customer_type = "PLATINUM";
		int reward_points = ((total_amount/1000)*50);
		if(customer_type == "GOLD" && reward_points >= 250) {
			total_amount = (int) (total_amount - (0.08 * total_amount));
		}else if(customer_type == "PLATINUM" && reward_points >= 350) {
			total_amount = (int) (total_amount - (0.15 * total_amount));
		}
		System.out.println("Total Amount : "+total_amount);
	}
}
