package assignments.assignment_9;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Question-10

Write a program that will print out information about the user based on email. Print first and last name from the upper case.

Sample Output:
     Input: craig_federighi@apple.com
    Output:
           First name: Craig
           Last name: Federighi
           Domain: apple
           Top-Level Domain: com*/
		
		printInfo("craig_federighi@apple.com");
	}
	
	public static void printInfo(String mail) {
		String firstName = mail.substring(0,1).toUpperCase()+mail.substring(1, mail.indexOf('_'));
		String lastName = mail.substring(mail.indexOf('_')+1,mail.indexOf('_')+2).toUpperCase()+mail.substring(mail.indexOf('_')+2, mail.indexOf('@'));
		String domain = mail.substring(mail.indexOf('@')+1,mail.indexOf('.'));
		String levelDomain = mail.substring(mail.indexOf('.')+1);
		
		System.out.println("First name: "+firstName+"\r\n" + 
				"Last name: "+lastName+"\r\n" + 
				"Domain: "+domain+"\r\n" + 
				"Top-Level Domain: "+levelDomain);
		
		
		
	}

}
