package assignments.Lab2;
import java.util.Scanner;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Question-5

Write a program that computes the tax and tip on a restaurant bill. 
The program should ask the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge. 
The tip should be 20 percent of the total after adding tax. 
Display the meal charge, tax amount, tip amount, and total bill on the screen.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the charge for the meal: ");
		double chargeOfMeal = input.nextDouble();
		double tax = chargeOfMeal*0.0675;
		double tip = (chargeOfMeal+tax)*0.2;
		
		System.out.println("The charge of meal is: "+chargeOfMeal+"$\nThe tax amount is: "+tax+
				"$\nThe tip amount is: "+tip+"$\nThe total bill is: "+ (chargeOfMeal+tax+tip)+"$");

	}

}
