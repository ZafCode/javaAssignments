package assignments.Lab2;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		int yesOrNo=0;
		System.out.print("Enter your first number: ");
		int firstNumber = input.nextInt();
		Compare(firstNumber, yesOrNo);
		}
	
	public static void Compare(int firstNumber, int yesOrNo) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your next number: ");
		int nextNumber = input.nextInt();
		System.out.print("Do you want to enter another number? 0-No, 1-Yes ");
		yesOrNo = input.nextInt();
		isValidNumber(yesOrNo);
		
		int smallestNumber=0,largestNumber=0;
		
		if (firstNumber<nextNumber) {
			
	    	smallestNumber=firstNumber;
	    	largestNumber=nextNumber;
	
		}else if(firstNumber>nextNumber){
			
			smallestNumber=nextNumber;
	    	largestNumber=firstNumber;
	    	
		}else {
	   		System.out.println("Numbers are equal.");
	   		Compare(firstNumber, yesOrNo);
	   		return;
	   	}
		

	   
	   	for (int i = 0; i < yesOrNo; ) {
			
	   		if (yesOrNo==0) {
			break;
	   		}else {
		
	   		System.out.print("Enter your next number: ");
	   		
	   		int thirdNumber = input.nextInt();
		
	   			if (thirdNumber<smallestNumber) {
			
	   				smallestNumber=thirdNumber;

	
	   			}else if(thirdNumber>largestNumber) {
			
	   			largestNumber=thirdNumber;
	    	
	   			}				
		
	   		}
		
	   		System.out.print("Do you want to enter another number? 0-No, 1-Yes ");
	   		yesOrNo = input.nextInt();
	   		
	   		isValidNumber(yesOrNo);
	   		
	   	}
	   	
	   	System.out.println("Smallest number is: "+smallestNumber);
		System.out.println("Largest number is: "+largestNumber);
		
	} 
	
	public static void isValidNumber(int yesOrNo) {
		
   		if (!(yesOrNo == 1 || yesOrNo == 0)) {
   			Scanner input = new Scanner (System.in);
   			System.out.println("You entered invalid number.");
			System.out.print("Do you want to enter another number? 0-No, 1-Yes ");	
	   		yesOrNo = input.nextInt();
		}	
	}
	
		
	}


