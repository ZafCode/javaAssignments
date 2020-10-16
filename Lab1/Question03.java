package assignments.Lab1;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question-3

We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
Write a method that accepts a number and prints true if the given number is special.

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false*/
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);

	}
	
	public static void specialEleven(int num1) {
		if (num1%11 ==0 || num1%11-1 == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
