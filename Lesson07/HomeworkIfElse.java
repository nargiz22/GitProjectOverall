package Lesson07;

import java.util.Scanner;

public class HomeworkIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  * Allow user to enter grade and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which
		 *  grade was entered by the user with explanation.
		 
		 * */
		
		Scanner myscanner=new Scanner(System.in);
		System.out.println("Please enter your grade");
		String letter = myscanner.next();
		System.out.println("Your grade is"+ letter);
		
		if(letter.equalsIgnoreCase(letter)) 
		{
			System.out.println("Excellent");
		}
		else if(letter.equalsIgnoreCase(letter)) 
		{
			System.out.println("Good");
		}
		else if(letter.equalsIgnoreCase(letter)) 
		{
			System.out.println("Average");
		}
		else if(letter.equalsIgnoreCase(letter)) 
		{
			System.out.println("Bad");
		}
		else 
		{
			System.out.println("Not Acceptable");
		}
		
		myscanner.close();
	}

}
