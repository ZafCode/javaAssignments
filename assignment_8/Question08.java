package assignments.assignment_8;

public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers
 for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input : 2
Output : 1

Input : 9
Output : 21
 * 
 * */
		fib(9);
		fib(2);
		
	}
	
	public static void fib(int number) {
		
		int preNumber= 0;	
		int nextNumber = 1;
		int sum = 0;
		
		if(number == 2) {
			sum= 1;
		}else {
			
		
		
		for (int i = 0; i < number-1; i++) {
			sum = preNumber + nextNumber;
			preNumber = nextNumber;
			nextNumber=sum;
		}
		
	}
		System.out.println(sum);
	}

}
