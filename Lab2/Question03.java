package assignments.Lab2;
import java.util.Scanner;
public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Question-3

Write a program that asks the user for a positive nonzero integer value. 
The program should use a loop to get the sum of all the integers from 1 up to the number entered.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive nonzero number: ");
		int number = input.nextInt();
		
		sumOfNumbers(number);

	}
	
	public static void sumOfNumbers(int number) {	
		if (number>0) {
			
			int sum=0;
			for (int i = 1; i <= number; i++) {					
					sum = sum+i	;			
			}				
			System.out.println("The sum of all numbers from 1 up to the entered number is: "+sum);
			return;
			
		}else {
			System.out.println("You entered invalid number. Please try again...");
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a positive nonzero number: ");
			number = input.nextInt();
			sumOfNumbers(number);
	
		}				
	}
}
