package guvitask4;

public class Question1 {

/*	Write the java program that declares four integer variables a,b,c and d. Then write an if statement that checks whether the sum of a and b 
	
	is greater than the sum c and d.If the condiiton is true, the program should output a message indicating that the sum of a and b is greater than
	
	the sum of c and d.
*/
	
	
	public static void main(String[] args) {
		
		//Initializing the variable name a,b,c and d with integer datatype.
		int a = 100;
		int b = 99;
		int c = 98;
		int d = 97;
		
		//Using the arithemetic operator (+), storing the sum of A&B also C&D value in two different variable.
		
		int sumOfAB = a + b;
		int sumOfCD = c + d;
	
		//IF else condition statement to print which is the greater value. 
		
		//Equality operator (==) check the sum of a&b is equal to sum of c&d.
		if(sumOfAB == sumOfCD ) 
		{
			System.out.println("The sum of a and b is Equal TO the sum of c and d"); //If condition true this block will print
		
		}
		//Relational Operator(>=) will check the right operand value is greater than left operand
		else if(sumOfAB>=sumOfCD)
		{
			System.out.println("The sum of a and b is Greater than the sum of c and d");// this is separate block of condition checks if previous block is false.
		
		}else
		{
			System.out.println("The sum of a and b is Lesser than the sum of c and d");// If both the condition is not true this else part will execute.
		}
	
	
	}

}
