package assignments.assignment_9;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-12

Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Sample output:

     input: xHiX
     output: Hi

     input: apple
     output: apple

     input: xUxL
     output: UxL

     input: JavaX
     output: Java*/
		
		withOutX("xHiX");
		withOutX("apple");
		withOutX("xUxL");
		withOutX("JavaX");

	}
	
	public static void withOutX(String text) {
		
		if(text.toLowerCase().charAt(0) == 'x')  {
			
			text = text.substring(1);
			
		}
		if(text.toLowerCase().charAt(text.length()-1) == 'x' ){
			
			text = text.substring(0,text.length()-1);
			
		}
			System.out.println(text);
		
		
	}

}
