package assignments.assignment_05_forLoop;
import java.util.Scanner;
public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question-4:
//
//	Write a while loop that lets the user enter a number. 
//	The number should be multiplied by 10, and the result stored in the variable product.
//	The loop should iterate as long as product contains a value less than 100.
		
		Scanner input = new Scanner(System.in);
		int number =0;
		int product = 0;
		
		
		while(product < 100 ) {
			
			System.out.println("Please enter a number:");
			number = input.nextInt();
			product = product+number*10;

		}
				
	}

}
