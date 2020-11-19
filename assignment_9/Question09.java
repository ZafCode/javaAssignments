package assignments.assignment_9;

public class Question09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-9

In this task, you need to swap the first name with the last name in the email. If the email doesn't contain underscore - do not anything.

Sample Output:
     input: mike_tyson@gmail.com
     output: tyson_mike@gmail.com

     input: barakobama@gmail.com
     output: barakobama@gmail.com
		 * */

		swapEmail("mike_tyson@gmail.com");
		swapEmail("barakobama@gmail.com");
	}
	
	public static void swapEmail(String mail) {
		
		if(mail.contains("_")) {
			
			String name = mail.substring(0,mail.indexOf('_'));
			String surname = mail.substring(mail.indexOf('_')+1,mail.indexOf('@'));
			
			System.out.println(surname+"_"+name+"@gmail.com");
		}else{
			System.out.println(mail);
		}
		
		
	}
	
	

}
