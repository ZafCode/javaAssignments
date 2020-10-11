package assignments.assignment_06_forLoop;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * *
		 * Question-2

			Write a Java program to print the following pattern
			
			1 2 3 4 5 6 7
			1 2 3 4 5 6
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2
			1
			1 2
			1 2 3
			1 2 3 4
			1 2 3 4 5
			1 2 3 4 5 6
			1 2 3 4 5 6 7
					 */
		
			for (int i = 1; i <= 13; i++) {
						
						if (i<=7) {
							
							for (int j = 6; j >= i-1; j--) {
								System.out.print(7-j+" ");
							}
							
							
						}else {
							for (int j = 1; j <= i-6; j++) {
								System.out.print(j+" ");
							}
							
						}
						
						
						System.out.println();
					}

	}

}
