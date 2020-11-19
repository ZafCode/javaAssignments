package assignments.assignment_9;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-15

Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Sample Output:

     input: catdog
     output: true

     input: catcat
     output: false

     input: cat-cheetah-dog-cat
     output: false*/
		
		catDog("catdog");
		catDog("catcat");
		catDog("cat-cheetah-dog-cat");

	}
	
	public static void catDog(String text) {
		
		if (count(text,"cat") == count(text,"dog") ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	
	public static int count(String text, String word) {
		int catCount = 0;
		while(text.toLowerCase().contains(word)) {
			int catPlace = text.indexOf(word);
		text = text.substring(0,catPlace) + text.substring(catPlace+3);
			
			catCount++;
		}
		
		return catCount;
	}

}
