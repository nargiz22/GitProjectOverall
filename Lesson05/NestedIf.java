package Lesson05;

public class NestedIf {

	public static void main(String[] args) {
		// if it is mornin i want to say----> Good morning
		// if it as a school day--------> you are at school
		// else -----------------------> you are at home
		// esle (not morning) ----> good afternoon
			//if Thursday ------> You are at the movie
			//else -----------------> You are sleeping

		boolean isMorning = false;
		boolean isSchoolDay = true;
		boolean isThursday =false;

		if (isMorning) {                                    //outer if
			System.out.println("Good Morning!");
			if (isSchoolDay) {                            //inner if
				System.out.println("You are at school!");
			} else {                                      // inner else
				System.out.println("You are at school!");
			}
		}

		else {                                       //outer else
			System.out.println("Good Afternoon!");
			if (isThursday) 
			{
				
				System.out.println("You are at the movie!");
			}
			else 
			{
				System.out.println("You are sleeping");
			}
		}

	}

}
