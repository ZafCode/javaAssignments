package assignments.Lab1;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-5

You are driving a little too fast, and a police officer stops you. 
Write a method to compute the result: 0=no ticket, 1=small ticket, 2=big ticket. 
If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0*/
		
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);

	}
	
	public static void caughtSpeeding(int speed, Boolean isBirthday) {
		int speedLimit;
		
		if (isBirthday) {
			speedLimit=65;
		}else {
			speedLimit=60;
		}
		
		if (speed<=speedLimit) {
			System.out.println("0=no ticket");
		}else if (speed>speedLimit && speed<=speedLimit+20) {
			System.out.println("1=small ticket");
		}else {
			System.out.println("2=big ticket");
		}
	}

}
