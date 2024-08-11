package guvitask4;

import java.util.Scanner;

public class Question4 {

/* Write a java program to get 2 numbers from the user and swap their values without any loss of data. 
  
   You can make use of additional variable for swapping. 
   
   Print the corresponding swapped values of the two numbers as output in the console.
	
*/	
	
	public static void main(String[] args) {
		
		//Declared three variable in integer datatype to store the number.
		int number1, number2, temp;
		
		//Creating object for Scanner inbuilt class to read the user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of First number  : ");
		//nextInt one of the scanner object used to get and store the integer value in number1 variable.
		number1 = sc.nextInt();
		System.out.println("Enter the value of Second number : ");
		//nextInt one of the scanner object used to get and store the integer value in number2 variable.
		number2 = sc.nextInt();
		//Getting output of the user input before we swap the values.
		System.out.println("Before Swap---> value of A is :" + number1);
		System.out.println("Before Swap---> value of B is :" + number2);
		
		//Swapping the two values in different variables.
		//value of the number1 variable will store in temp variable now.
		temp = number1;
		//value of the number2 variable will store in number1 variable now.
		number1 = number2;
		//value of the temp variable will store in number2 variable now.
		number2 = temp;
		
		//Getting output after the values are Swaaped.
		System.out.println("After Swap---> value of A is : " + number1);
		System.out.println("After Swap---> value of B is : " + number2);
		
		//Closing the scanner object it will not leak memory after execute
		//we can also use Try-Catch block to stop the memory leak.
		sc.close();
	}

}
