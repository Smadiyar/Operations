package Techtorial;

import checks.ArrayUtils;

public class TernoryOperator {
	
	public static void main(String[] args) {
		
		String story="I struggled to recall the last occasion that I’d seen my wife naked, "
				+ "and it had been bright enough to see her properly."
				+ " Not that year, for sure; I wasn’t even certain that it had happened the year before.";
		
		
		
		if(story.split(" ").length>100) {
			System.out.println(new ArrayUtils().arrayHelper(story.split(" ")));
		}
		else {
			System.out.println("It's a short story");
		}
				
	}

}
