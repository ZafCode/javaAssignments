package assignments.assignment_8;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question-13

This method calculates a water bill, the method gets a double and returns a double.

The more water you use the more it will cost you (as a fine for wasting water).

for example:

waterTax(50)
returns 30

waterTax(55)
returns 49.5

waterTax(101)
returns 140.9

waterTax(151)
returns 235.9

the regular calculation under 50 is
bill = units * 0.60;
above 50 is:
bill = units * 0.90;

above 100 the calculation is like above 50 but with a 50 as fine

and above 150 it is the same as above 50 (units *0.90) but with a 100 fine added to the price.*/
		
		System.out.println(waterTax(50));
		System.out.println(waterTax(55));
		System.out.println(waterTax(101));
		System.out.println(waterTax(151));

	}
	
	public static double waterTax(double units) {
		
		double k = 0.0;
		double wastingWater = 0.0;
		if (units <= 50) {
			k = 0.60;
		}else {
			if(units>150) {
				wastingWater = 100;
			}else if(units>100) {
				wastingWater=50;
			}
			k = 0.90;
		}
		
		return (units * k)+wastingWater ;
		
		
	}

}
