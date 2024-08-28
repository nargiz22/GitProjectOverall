package Lesson07;

public class IntroToSwitch {

	public static void main(String[] args) {
		
		//given a number 1 to 7, print the name of the day
		/// SWITCH USE ONLY BYTE,SHORT,INT,CHAR,STRING
		
		int day =6;
		
		if(day==1) 
		{
			System.out.println("MOnday");
		}
		else if (day==2)
		{
			System.out.println("Tuesday");
		}
		else if (day==3)
		{
			System.out.println("Wednesday");
		}
		else if (day==4)
		{
			System.out.println("Thursday");
		}
		else if (day==5)
		{
			System.out.println("Friday");
		}
		else if (day==6)
		{
			System.out.println("Saturday");
		}
		else if (day==7)
		{
			System.out.println("Sunday");
		}
		else 
		
		{
			System.out.println("Invalid day");
		} 
		
		// using switch
		
		switch(day) 
		{//open block
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid day");
			break;
		}//close block






	}

}
