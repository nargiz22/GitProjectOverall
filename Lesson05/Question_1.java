package Lesson05;

public class Question_1 {
	
/*Write a program to swap 2 numbers without a temporary variable?
 *  Swap 2 strings without a temporary variable?
int a = 5;
int b = 10;
At the end, the value of b will be 5 and the value of a will be 10.
You can add them together and remove them from each other.
	
	
	 * */
	
	public static void main(String[] args) {
		
		int a=5;
		int b=9;
		
		System.out.println("a= "+ a+ " b= "+ b);
		
		//using temporary variable
	//	int temp =a;
	//	a=b;
	//	b=temp;
		
		a= a+b;//a= 14 b= 9
		b= a-b; //a=14 b=5
		a= a-b; //a=9 b=5
		
		
		System.out.println("a= "+ a+ " b= "+ b);
		
		System.out.println("------------------------------");
		
		String str1="Java";
		String str2="Selenium";
		
		System.out.println("str1=" + str1 + " str2=" + str2);

		str1 = str1 + str2; // str1=JavaSelenium
		System.out.println("str1=" + str1 + " str2=" + str2);

		str2 = str1.substring(0, str1.length() - str2.length());//str2=Java
		System.out.println("str1=" + str1 + " str2=" + str2);

		str1 = str1.substring(str2.length()); // str1=Selenium
		System.out.println("str1=" + str1 + " str2=" + str2);

	}

}
