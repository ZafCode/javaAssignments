package assignments.assignment_8;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-14

This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table*/
		
		System.out.println(threeLock(true, true, true));
		

	}
	
	public static boolean threeLock(boolean a, boolean b, boolean c) {
		
		if((a == true && b == true ) || c == true) {
			return true;
		}else {
			return false;
		}
		
	}

}
