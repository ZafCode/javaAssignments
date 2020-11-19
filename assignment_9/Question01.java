package assignments.assignment_9;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question-1

Create a method called tipCalculator which accepts parameters:  boolean isSplit, int numberPeople, double checkAmount, String serviceQuality

Ask the user to enter each value. 

User should select service quality that will correspond to tip percent.

Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%

The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Split:");
		String split=scan.next();
		
		System.out.println("Number of people:");
		int numberOfPeople=scan.nextInt();
		
		System.out.println("Check amount:");
		double amount=scan.nextDouble();
		
		System.out.println("Service Quality:");
		String serviceQuality=scan.next();
		
		tipCalculator(split, numberOfPeople, amount, serviceQuality);
		
	}
	
	 public static void tipCalculator(String isSplit, int numberPeople, double checkAmount, String serviceQuality) {
		 	
				double totalTip=0;
				double totalPay=0;
				double totalPerPerson=0;
				double tipPerPerson=0;
				double tipRatio=0;
				String people="&";
				
				switch(serviceQuality){
				  case "Poor" :
				    tipRatio=0.05;
				    break;
				  case "Fair" :
				    tipRatio=0.10;
				    break;
				  case "Good" :
				    tipRatio=0.15;
				    break;
				  case "Great" :
				    tipRatio=0.20;
				    break;
				  case "Excellent" :
				    tipRatio=0.25;
				    break;
				}
				
				totalTip=tipRatio*checkAmount;
				tipPerPerson=totalTip/numberPeople;
				totalPay=checkAmount+totalTip;
				totalPerPerson=totalPay/numberPeople;
				
				for(int i=1 ; i<numberPeople ; i++){
				  people=people+"&";
				}
				
				if(isSplit.equals("Yes")){
				  System.out.println("Number of people entered: "+people+ 
		"\nTotal to pay: "+totalPay+ "\nTotal tip: "+totalTip+ "\nTotal per person: "+totalPerPerson+
		"\nTip per person: "+ tipPerPerson);
				}
		  }
}
