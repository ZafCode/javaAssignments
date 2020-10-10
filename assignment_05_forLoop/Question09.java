package assignments.assignment_05_forLoop;
import java.util.Scanner;
public class Question09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question-9:

//Write a program for the following logic:
//Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
//if end = 10, OUTPUT = 1, 3, 5, 7, 9
//if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
//You should use while loop and if-else statements. Note that, there should 
//not be any comma after the last digit.
		Scanner input = new Scanner (System.in);
		System.out.println("please enter a number:");
		int number = input.nextInt();
		int i = 0;
		while(i<=number) {
			if(i%2!=0) {
				if(i==number || i==number-1) {
					System.out.println(i);
				}else {
					System.out.print(i+", ");
				}
			}
			i++;
		}

	}

}
