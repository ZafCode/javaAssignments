package assignments.assignment_06_forLoop;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Question-3
//
//		Write a Java program to print the following pattern
//
//		1 2 3 4 5 6 7
//		 2 3 4 5 6 7
//		  3 4 5 6 7
//		   4 5 6 7
//		    5 6 7
//		     6 7
//		      7
//		     6 7
//		    5 6 7
//		   4 5 6 7
//		  3 4 5 6 7
//		 2 3 4 5 6 7
//		1 2 3 4 5 6 7
		
		
		
			for (int i = 1; i <= 13; i++) {
						
						if (i<7) {
							
							for (int j = i; j <= 7; j++) {
								System.out.print(j+" ");
							}
							
							System.out.println();
							
							for (int j = 1; j <= i; j++) {
								System.out.print(" ");
							}
							
						}else {
							
							for (int j = i; j >= 7; j--) {
								System.out.print(14-j+" ");
							}
							
							System.out.println();
							
							for (int j = i; j <= 11; j++) {
								System.out.print(" ");
							}
						}
						
						
						
					}

	}

}
