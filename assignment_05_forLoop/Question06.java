package assignments.assignment_05_forLoop;
import java.util.Scanner;
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question-6:

// Write a program to print Fibonacci series of n terms where n is declared by user :
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a n number:");
		int n = input.nextInt();
		int a = 0, b = 1;

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a+" ");

            int fibNum = a + b;
            a = b;
            b = fibNum;
        }
			
	}
		
}

