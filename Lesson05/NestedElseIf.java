package Lesson05;

public class NestedElseIf {

	public static void main(String[] args) {
		// write java prog to check if student has complete the quiz
		// if the student did quiz,then check the score and give
		//these evaluations:
		// if the score is 90 or above 90,the print "A,Great job!"
		//if the score is 80 to 90 ,then print "B ,Well done"
		//if the score is 70 to 80, then " C ,You  passed
		//otherwise print "Try harder next time"
		
		
		
		
		//step by step approach:
			//if the student did the quiz
	//				else  didnt
		
		
		boolean guizIsDone = true;
		int score = 86;
		
		if (guizIsDone) 
		{
			if( score>= 90) 
			{
				System.out.println("A,Great Job!");
			}
			else if ( score >= 80) 
			{
				
				System.out.println("B,Well DOne!");
			}
			else if (score >= 70) 
			{
				System.out.println("C,You Passed");
			}
			else 
			{
				System.out.println("Try harder next time!");
			}
		}
		else 
		{
			System.out.println("You did not do the quiz,so you failed");
		}

	}

}
