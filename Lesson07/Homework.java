package Lesson07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which
		 *  grade was entered by the user with explanation.
		 * 
		  */
		
		Scanner grade=new Scanner(System.in);
		System.out.println("Please enter your grade");
		//String letter = grade.next();
		//CASE "A"
		//we can do with char to
		char letter=grade.next().charAt(0);
		System.out.println("Your grade is "+ letter);
		
		switch (letter)
		{ 
		case 'A':
		case 'a':
			System.out.println("Excelent");
			break;
			
		case 'B':
			System.out.println("Good");
			break;
			
		case 'C':
			System.out.println("Average");
			break;
			
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("Not Acceptable");
		
			grade.close();
		
		}

		
	}

}
