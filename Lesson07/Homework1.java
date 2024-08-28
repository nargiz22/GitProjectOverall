package Lesson07;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * ➔ Write a program that lets user to enter apple,dell,acer laptop models;

		 *If it is apple show “Apple-no virus”

		 * If it is dell show “Tough one”

		 *If it is acer show “Cheap one”

		 * Else “do not buy that one!”
		 * */
		
		Scanner device=new Scanner(System.in);
		System.out.println("Enter laptop model:");
	    String s= device.nextLine();
		
		switch(s) 
		{
		case "Apple":
			System.out.println("Apple -no virus");
			break;
			
		case "Dell":
			System.out.println("Tough one");
			break;
			
		case "Acer":
			System.out.println("Cheap one");
			break;
			
		default:
			System.out.println("Do not buy that one!");
			break;
			
			
			
			
		}
		device.close();
		
		///2ND WAY IF ELSE
		
		if(s.equalsIgnoreCase("Apple"))
				{
					System.out.println("Apple - no virus");
				}
		else if(s.equalsIgnoreCase("Dell")) 
		{
			System.out.println("Tough one");
		}
		else if(s.equalsIgnoreCase("Acer")) 
		{
			System.out.println("Cheap one");
		}
		else 
		{
			System.out.println("Do not buy that one");
		}

	}

}
