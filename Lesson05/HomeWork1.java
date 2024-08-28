package Lesson05;

public class HomeWork1 {

	public static void main(String[] args) {
		
		
//		//Write a java program to check if a patient has allergies.
//	    If the patient does not have allergies print "You’re healthy!".
//	    If the patient has allergies, check if it is a peanut allergy, 
//	    lactose allergy,
//	    bee allergy or seafood allergy 
//	    and print a statement telling the patient 
//	    "Don’t eat ___". (fill the line with the food names – peanut, seafood etc.)
		
		
		boolean IsPatientAllergy = true;
		boolean peanut = true;
		boolean lastoce = false;
		boolean bee = false;
		boolean seafood = true;
		
		if (IsPatientAllergy)
		{
			if(peanut) 
			{
				System.out.println("Don't eat peanut ");
				
			}
			if(lastoce) 
			{
				System.out.println("Try to come lactose free milk");
			}
			if (bee) 
			{
				System.out.println("If you see bee,run");
			}
			 if (seafood) 
			{
				System.out.println("Stay away from seafood");
			}
		
		}
		else 
		{
			System.out.println("You’re healthy!");
		}
		
		
	}

}
