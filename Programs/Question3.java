package guvitask4;

public class Question3 {

// Write a Java program to print the characters from A to Z.	
	
	public static void main(String[] args) {
		
/*   Initializing For Loop
		inside for loop we have declared the char datatype with variable name ch.
		ch = 'A' in ASCII character A hold the value of 65.
		ch <= 'Z' will set the condition execute till the declaration statisfy this condition, IN ASCII character Z hols the value 90.
*/		
		
		//Initialize the number in char datatype to print alphabet from A to Z.
		for(char ASCII = 65; ASCII <= 90; ASCII++)
		{
			System.out.print(ASCII + " ");
		}
		
		//Initialize the letter in char datatype to print alphabet from A to Z.
		for(char Alphabet = 'A'; Alphabet <= 'Z'; Alphabet++)
		{
			System.out.print(Alphabet + " ");
		}
		
	
	}

}
