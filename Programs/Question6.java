package guvitask4;

public class Question6 {

	//Write a program to print the factorial of a given number.
	
/*   What is factorial?
		
	The factorial number is which is multiplied by sequence of number from 1 till the actual number.
	
	EX: 5! = 5*4*3*2*1 = 120.
*/	
	
	
	public static void main(String[] args) {
		
		//initializing the variable with int datatype.
		int num = 5;	
		
		int factorial = 1;
	
		//For loop to execute the multiplication of number.
		
		for(int i=1;i<=num;i++)
		{
			 factorial *= i; // every iteration the factorial number is multiple by i value and update new value to the variable.
		}
	
		System.out.println("The Factorial of given number is : " + factorial);
	}

}
