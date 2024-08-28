package Lesson07;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Formula to declare variabel /(Primitive data types
		//data type/identifier   operator(=)  value;
		//this is the exact same pattern
		//Formula for non-primitive data type
		
		Scanner scanner=new Scanner(System.in);
		//scanner is INput used read new input
	
		System.out.println("Enter a sentence:");
		String text1=scanner.next();//read the input until next space 
									//save it in string
		System.out.println(text1);
		
		String text2=scanner.next();
		System.out.println(text2);
		
		String text3=scanner.nextLine();
		System.out.println(text3);
		
		
		
		//differents bewteen next and nextlIne
		//next read until next space
		//nextLIne read whole sentence
		
		System.out.println("enter a  current year");
		int  year= scanner.nextInt();
		System.out.println(year);
		
		
		System.out.println("Enter your name,age,salary,and gender");
		String name=scanner.next();
		int age= scanner.nextInt();
		double salary=scanner.nextDouble();
		char gender=scanner.next().charAt(0);
		
		System.out.println("Your info is:"+ name + age + salary + gender);
		
		scanner.close();
		
	}

}
