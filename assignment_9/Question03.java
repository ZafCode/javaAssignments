package assignments.assignment_9;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Question-3

You have a word, do the following:

1. When word has odd number of characters and:
     - 3 or more characters, print middle letter
              oak ==> a
              javav ==> v
     - Single character, print that character 3 times
             # ==> ###
             q ==> qqq

2. When word has even number of characters and:
     - 4 or more characters, print middle 2
            java ==> av
            apples ==> pl
            #$%^&* ==> %^
    - 2 characters, print those 2 characters twice
           @@ ==>@@@@
           $$ ==>$$$$
           hi ==> hihi*/
		
		character("oak");
		character("javav");
		character("#");
		character("q");
		character("java");
		character("apples");
		character("#$%^&*");
		character("@@");
		character("$$");
		character("hi");
		
	}
	
	public static void character(String word) {
		if (word.length()%2 != 0) {
			if (word.length()>=3) {
				System.out.println(word.charAt(word.length()/2));
			}else if(word.length()==1) {
				System.out.println(""+word+word+word);
			}
			
		}else {
			
			if (word.length()>=4) {
				System.out.println(""+ word.charAt(word.length()/2-1)+word.charAt(word.length()/2));
			}else if(word.length()==2) {
				System.out.println(""+word+word);
			}
			
		}
	}

}
