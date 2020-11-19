package assignments.assignment_9;

public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Question-7

Write a program that will print out the first half of the word twice.

Sample Output:

     input: java
     output: jaja*/
		
		twicePrint("java");
	}
	
	public static void twicePrint(String word) {
		System.out.println(""+word.substring(0,2)+word.substring(0,2));
	}
}
