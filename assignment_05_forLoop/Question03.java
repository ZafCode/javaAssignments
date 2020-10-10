package assignments.assignment_05_forLoop;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question-3:
//
//			Write a program that displays the number of even numbers between 5 and 50 (included)
		
		for(int i = 5 ; i <= 50 ; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
