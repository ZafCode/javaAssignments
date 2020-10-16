package assignments.Lab1;

public class Question01 {

	public static void main(String[] args) {
		
		/*
		 * Question-1

Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String

stringTimes("Hi", 2); = > HiHi
stringTimes("Hi", 3); = > HiHiHi
stringTimes("Hi", 1); = > Hi*/
		// TODO Auto-generated method stub
		
		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);

	}
	
	public static void stringTimes(String word, int time) {
		
		for (int i = 1 ; i <= time ; i++) {
			System.out.print(word);
		}
		System.out.println();
	}

}
