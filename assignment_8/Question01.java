package assignments.assignment_8;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plus();

	}
	
	public static void plus() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first number :");
		int firstNumber = input.nextInt();
		System.out.print("Please enter your second number :");
		int secondNumber = input.nextInt();
		int sum = firstNumber+secondNumber;
		System.out.println("Sum of numbers is: "+sum);
	}

}
