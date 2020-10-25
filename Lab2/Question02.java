package assignments.Lab2;
import java.util.Scanner;
public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Question-2

A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 serving in the bag and 
that a serving equals 300 calories. write a program that lets the user enter the number of cookies he or she actually ate 
and then reports the number of total calories consumed.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of your cookies: ");
		int numberOfCookies = input.nextInt();
		
		int consumedCalori= numberOfCookies * 300/(40/10);
		
		System.out.println("Consumed number of total calories is : "+consumedCalori);
		

	}

}
