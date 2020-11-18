package assignments.assignment_8;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-11

c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"*/
		
		System.out.println(c_profis(100,1500));
		System.out.println(c_profis(20,5));
		System.out.println(c_profis(100,100));

	}
	
	public static String c_profis(int buyPrice, int sellPrice) {
		if(buyPrice<sellPrice) {
			return "profit";
		}else if(buyPrice>sellPrice) {
			return "loss";
		}else {
			return "no loss";
		}
	}

}
