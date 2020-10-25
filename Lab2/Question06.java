package assignments.Lab2;
import java.util.Scanner;
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-6

Write a program that will ask the user to enter the amount of a purchase. 
The program should then compute the state and county tax sales tax. 
Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
The program should display the amount of the purchase , the state sales tax, 
the county sales tax, the total sales tax, and the total of the sale 
(which is the sum of the amount of purchase plus the total sales tax)*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the amount of a purchase: ");
		double purchase = input.nextDouble();
		double countyTax = purchase*0.02;
		double stateTax = purchase*0.04;
		
		System.out.println("The amount of the purchase is: "+purchase+"$\nThe state sales tax is: "+
		stateTax+"$\nThe country sales tax is: "+countyTax+"$\nThe total sales tax is: "+(stateTax+countyTax)+
		"$\nThe total of the sale is: "+(purchase+stateTax+countyTax)+"$");
		
		

	}

}
