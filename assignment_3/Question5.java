package assignments.assignment_3;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputSeconds, hours, minutes, seconds;
		
		inputSeconds = 3695;
		
		hours = ((inputSeconds - (inputSeconds%3600))/3600);
		
		minutes = ((inputSeconds - hours*3600)-((inputSeconds - hours*3600)%60))/60;
		
		seconds = ((inputSeconds - hours*3600)%60);
				
		System.out.println( hours+" hours, "+minutes+" minutes, and "+ seconds +" seconds");
		
	
		
		/*
		 * Sample Output:
		 * 
		 * 1 h = 3600
		 * 1 m = 60

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds
		 */

	}

}
