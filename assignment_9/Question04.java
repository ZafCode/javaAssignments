package assignments.assignment_9;

public class Question04 {
	public static void main(String[] args) {
	
		/*
		 * Question-4

You have a word, do the following:

If the word has odd number of characters and has 5 or more characters, print the middle three characters of the word. Otherwise, print "invalid".

Sample Output:

       fifteen ==> fte
       apple ==> ppl
       hey ==> invalid
       java ==> invalid
      whatsup ==> ats
      $ ==> invalid*/
		
		middleThree("fifteen");
		middleThree("apple");
		middleThree("hey");
		middleThree("java");
		middleThree("whatsup");
		middleThree("$");
		
	}
	
	public static void middleThree(String word) {
		
		if (word.length()%2 != 0 && word.length()>=5) {
			System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
		}else {
			System.out.println("invalid");
		}
		
	}

	
}
