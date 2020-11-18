package assignments.assignment_8;

public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Complete a method isPalindrome() that will check if the number is a palindrome. Print your result as a boolean (true or false).
Do not convert int into a string!
Example:
input: 1001
output: true

Example:
input: 1234
output: false*/
		
		isPalindrome(1234);
		isPalindrome(1001);

	}
	
	public static void isPalindrome(int number) {
		
		  int remainder;
		  int sum=0;
		  int num1;    		  
		  num1=number;    
		  
		  while(number>0){    
			  
		   remainder=number%10;
		   sum=(sum*10)+remainder;    
		   number=number/10;  
		   
		  }    
		  if(num1==sum) {
			  System.out.println(true);      
		  }
		   
		  else    {
			  System.out.println(false);      
		  }
		   
			
			
		}
		
	}


