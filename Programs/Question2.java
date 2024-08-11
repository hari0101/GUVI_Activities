package guvitask4;

public class Question2 {

// Have a variable store an integer. Create an if statement to find out if it's an even number.	

	
	public static void main(String[] args) {
		
		//Initialized the integer in the variable name as num.
		int num = 100;
	
		//By using Arithemetic operator (%) check the declared number return the remainder as zero.
		if(num % 2==0)
		{
			System.out.println("The given integer " + num + " is even number"); //if condition true this block print.
		}
		else
		{
			System.out.println("The given integer " + num + " is odd number"); //if previous block false this block will execute.
		}
	}

}
