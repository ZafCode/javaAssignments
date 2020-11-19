package assignments.assignment_9;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findTheRoute("A", "D");
		findTheRoute("C", "A");

	}
	
	public static void findTheRoute(String starPoint , String endPoint) {
		
		    String direction="";
		    
		    if(starPoint.equals(endPoint)){
		      System.out.println(starPoint+" found");
		    }else{
		      if(starPoint.equals("A")){
		        direction="right";
		        if(endPoint.equals("B")){
		        }else{
		          direction = (endPoint.equals("C") ? direction+" > down" : direction+" > down > left");
		        }
		      }else if(starPoint.equals("B")){
		        direction="down";
		        if(endPoint.equals("C")){
		        }else{
		          direction = (endPoint.equals("D") ? direction+" > left" : direction+" > left > up");
		        }
		      }else if(starPoint.equals("C")){
		        direction="left";
		        if(endPoint.equals("D")){
		        }else{
		          direction = (endPoint.equals("A") ? direction+" > up" : direction+" > up > right");
		        }
		      }else if(starPoint.equals("D")){
		        direction="up";
		        if(endPoint.equals("A")){
		        }else{
		          direction = (endPoint.equals("B") ? direction+" > right" : direction+" > right > down");
		        }
		      }
		        System.out.println(direction+": "+endPoint+" found");
		    }
		
	}

}
