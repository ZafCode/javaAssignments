package assignments.assignment_8;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube();

	}
	
	public static void cube() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your number :");
		int firstNumber = input.nextInt();
		
		int cubedNumber = firstNumber*firstNumber;
		System.out.println(cubedNumber);
	}

}
