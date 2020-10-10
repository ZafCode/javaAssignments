package assignments.assignment_05_forLoop;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a for loop that displays the following set of numbers:
//
//			0,10,20,30,40,50,...1000
		
		for(int i = 0 ; i <= 1000 ; i+=10) {
			
			if (i==1000) {
				System.out.print(i);
			}else {
			System.out.print(i+",");
		}

	}

	}
	
}
