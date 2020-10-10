package assignments.assignment_05_forLoop;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question-11:
//
//			Print the following output using nested for loops.
//
//		   	 4      3       2      1
//
//			     3       2      1
//
//			         2       1
//
//			              1
		 
		for(int i = 4 ; i >= 1 ; i--) {
			for(int j = i ;  j >= 1 ; j--) {
				
				System.out.print(j+"       ");
				
			}
			
			System.out.println();
			System.out.println();
			for (int k = i-1; k < 4; k++) {
				System.out.print("    ");
			}
		}

	}

}
