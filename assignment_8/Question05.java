package assignments.assignment_8;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner inp = new Scanner(System.in);
	     System.out.println("Please enter a number: ");
	     int n = inp.nextInt();
	    
	    sign(n);
		

	}
	
	  public static void sign(int n)
	  {
	    //your code here
	    if(n==0){
	      System.out.println("0");
	    }else if(n<0){
	      System.out.println("-1");
	    }else if(n>0){
	      System.out.println("1");
	    }
	  }
}
