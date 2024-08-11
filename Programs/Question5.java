package guvitask4;

import java.util.Scanner;

public class Question5 {

   // Write the java program to check the number is prime or not.
/*	
	The prime numbers are natural number which are only divisibe by 1 and itself, have only two divisor.
	
	Ex: 13 ---> it have factor of 1 and 13
	
	
*/	
	public static void main(String[] args) {

		//Declared the variable of integer datatype.
		int primeNum, count =0;
		
		//Creating object for Scanner inbuilt class to read the user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		//Using nextint we are getting and storing the value from user.
		primeNum = sc.nextInt();
		
		//Condition begins with if statement it's true when user enter value is greater than 1.
		if(primeNum>1)
		{
			//To check whether the user input input value is divisible by 1 and itself.
			for(int i=1;i<=primeNum;i++)
			{	
				//check if the given number and i value return remainder as zero.
				if(primeNum%i==0)
				{
					//when the if statement is true the count will increment based on the value.
					//Since the prime number always have two divisor.
					count++;
				}
			}
		//If condition when the above for loop iterate and return count=2 below line execute.
			if(count==2)
		{
			System.out.println(primeNum + " is a Prime Number"); //Print this when IF condition true
		}
		else
		{
			System.out.println(primeNum + " is not a Prime Number"); ////Print this when IF condition false.
		}
		
		}
		else
		{
			System.out.println(primeNum + " is not a Prime Number"); //This will be printed if none of the condition is true.
		}
	
		//Closing the scanner object it will not leak memory after execute
		//we can also use Try-Catch block to stop the memory leak.
		sc.close();
	
		
	}
	

}
