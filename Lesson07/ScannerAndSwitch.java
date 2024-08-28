package Lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		
		// Ask a user enter there country
		//then print the language they speak
		
		Scanner myScanner=new Scanner(System.in);
		
		System.out.println("Where are you from?");
		String country =myScanner.nextLine();
		
		//Using switch
		
		switch(country) 
		{
		case "Albania":
		case "Kosova":
			System.out.println("You speak Albanian");
			break;
			
		case "USA":
		case "UK":
		case "Australia":
			System.out.println("YOU speak English!");
			break;
		default:
			System.out.println("I will have to add that to the case");
			break;
			
			
		}
		
		//2nd way with IF
		
		//how we handle case differentss: UK /uk/Uk
		//we need convert to lower case;
		//equalsIgnoreCase using this we can avoid case sensitive lowe upper case
		
		
		//using if --else if
		
		if(country.equals("Albania") || country.equals("Kosova")) 
		{
			System.out.println("You speak Albanian");
		}
		else if(country.equalsIgnoreCase("USA") ||
				country.equalsIgnoreCase("UK")
				|| country.equalsIgnoreCase("Australia")) 
		{
			System.out.println("YOU speak English!");
		}
		else 
		{
			System.out.println("I will have to add that to the case");
		}
		
		
		myScanner.close();
		

	}

}
