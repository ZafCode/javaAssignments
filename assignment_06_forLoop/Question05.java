package assignments.assignment_06_forLoop;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Write a Java program to print the following pattern

1111111
1111122
1111333
1114444
1155555
1666666
7777777*/
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7-i; j++) {
				System.out.print("1");
				
			}
			
			for (int j = 1; j <= i ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
