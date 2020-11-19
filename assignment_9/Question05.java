package assignments.assignment_9;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 * Question-5

You have 2 words, both of them have 3 characters. 
If either of them does not have exactly 3 characters, print "cannot merge" Merge their characters one by one and print together like below:

Sample Output:

     aok
     lol
     alookl

     ear
     pie
    epaire

    java
    wow
    cannot merge*/
		
		merge("aok", "lol");
		merge("ear", "pie");
		merge("java", "wow");

	}
	
	public static void merge(String word1 , String word2) {
		
		if (word1.length()==3 && word2.length()==3) {
			
			String mergedWord = "";
			for (int i = 0; i < 3; i++) {
				mergedWord+=""+word1.charAt(i)+word2.charAt(i);
			}
			
			System.out.println(mergedWord);
		}else {
			System.out.println("cannot merge");
		}
		
		
		
	}

}
