package assignments.assignment_3;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int priceItem,changeItem,quartersC,dimesC,nicklesC;
		
		priceItem = 95;
		
		changeItem = 100 - priceItem;
		
		quartersC = (changeItem - (changeItem%25))/25;
		
		dimesC = ((changeItem - quartersC*25)-((changeItem - quartersC*25)%10))/10;
		
		nicklesC = (changeItem - quartersC*25 - dimesC*10)/5;
				
		System.out.println("Price in cents : "+ priceItem);
		
		System.out.println("Your change is "+quartersC+ " quarters, "+dimesC+" dimes, and "+ nicklesC+" nickles");
		
		
	}

}
