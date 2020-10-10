package assignments.assignment_05_forLoop;
import java.util.Scanner;
public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Question-8:
//
//			Write a program to calculate the sum of the numbers from 1 till upper bound.
//			If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
//			If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
//			If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
//
//			You should use a while loop.
		Scanner input = new Scanner(System.in);
//		
		System.out.println("please enter a number:");
		int number = input.nextInt();
		int sum=0;
		int i = 1;
		while(i<=number) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum+" ");

	}

}
