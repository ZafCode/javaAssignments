package assignments.assignment_9;

public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-6

Write a program that will reverse a string. Your program should reverse a string only 5 characters long. 
If the word is shorter, display message: "Too short!". If the word is longer, display the message: "Too long!". 
Otherwise, reverse this word and print out the result into the console.

Sample Output:

     input: cat
     output: Too short!


     input: singularity
     output: Too long!


     input: apple
     output: elppa*/
		
		reverse("cat");
		reverse("singularity");
		reverse("apple");

	}
	
	public static void reverse(String word) {
		if (word.length()<5) {
			System.out.println("Too short!");
		}else if(word.length()>5) {
			System.out.println("Too long!");
		}else {
			String reverseWord="";
			for (int i = word.length()-1; i >= 0 ; i--) {
				reverseWord+=word.charAt(i);
			}
			System.out.println(reverseWord);
		}
	}

}
