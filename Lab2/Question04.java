package assignments.Lab2;
import java.util.Scanner;
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Question-4

Write a program that asks user for the number of males and the number of females registered in a class.
 The program should display the percentage of males and females in the class.*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number of females in your class: ");
		float numberOfFemale=input.nextFloat();
		System.out.println("Please enter number of males in your class: ");
		float numberOfMale=input.nextFloat();

		
		float percentegeOfFemale = 100*numberOfFemale/(numberOfFemale+numberOfMale);
		float percentegeOfMale = 100*numberOfMale/(numberOfFemale+numberOfMale);
		
		
		System.out.println("The percentage of females in the class: %" + percentegeOfFemale);
		System.out.println("The percentage of males in the class: %"+ percentegeOfMale);
		

	}

}
