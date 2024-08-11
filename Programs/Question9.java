package guvitask4;

import java.util.Scanner;

public class Question9 
{
// Write the java program to check whether the person is a senior citizen or not.
	
	
	
	public static void main(String[] args) {

		//Creating scanner object to get the user input.
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the Person Age : ");
		
		//We are getting the user input as Integer type. 
		int age = scan.nextInt();
		
		//Getting one more input from user
		System.out.println("Enter the Person Age : ");
		int Age = scan.nextInt();
		
		//Closing the scanner object, this will not make memory leak.
		scan.close();
		
		//Creating the IF condition to check whether person is senior citizen or not by their age.
		
		if(age>=60)
		{
			System.out.println("The Person with age " + age + " is a senior citizen of nation");
		}
		else
		{
			System.out.println("The Person with age " + age + " is not a senior citizen of nation");
		}
		if(Age<60)
		{
			System.out.println("The Person with age " + Age + " is not a senior citizen of nation");
		}
		else
		{
			System.out.println("The Person with age " + Age + " is a senior citizen of nation");
		}
	}

}
