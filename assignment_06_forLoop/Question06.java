package assignments.assignment_06_forLoop;

public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-6
Write a Java program to print the following pattern

*/
		
		/*
		 * for (int i = 0; i <= k-1 ; i++) {
				
1
2 6
3 7 10	
				
			System.out.print(k+" ");
			}*/

		
//		System.out.println(1);
//		System.out.print(2+" ");
//		System.out.println(2+4);
//		System.out.print(3+" ");
//		System.out.print(3+4+" ");
//		System.out.print(3+4+3);
		
		for (int i = 1; i <= 5; i++) {
			
			int a=i;
			
			for (int j = 1; j <= i; j++) {
				
				
				
				System.out.print(a+" ");
				a=a+5-j;
			}
				
				System.out.println();	
			
			}
			
		}	

	}

//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15
