package Lesson05;

public class ElseIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 = 55;
		double d2 = 35.5;
		
		//d1 might be larger than d2
		//d2 might be larger than d2
		//d1 and d2 are equal
		
		if (d1 > d2) 
		{
			System.out.println("Number " + d1 + "is larger than " + d2);
			
		}
		
		else if(d1 < d2) 
		{
			System.out.println("Number" + d2 + " is larger than" +d2);
		}
		else //d1 == d2 or d2 is larger than d1
		{
			 System.out.println("Number "+ d2 + " is larger than " +d1);
		}

	}

}
