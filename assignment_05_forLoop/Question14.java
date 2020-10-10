package assignments.assignment_05_forLoop;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question-14:
//
//			Write nested loop to draw this pattern
//
//		##
//		#  #
//		#   #
//		#    #
//		#     #
//		#      #
//		#       #
		
		for(int i = 1 ; i <=7 ; i++) {
			System.out.print("#");
			for(int f = i ; f >1 ; f--) {
				System.out.print(" ");				
			}
			System.out.print("#");
			System.out.println();
		}

	}

}
