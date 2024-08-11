package guvitask4;

public class Question10 {

// Write a program to count number of digits in an integer.	
	
	
	public static void main(String[] args) {

		//Initialize numbers with long datatype.
		long Numbers = 987654321;
		
		//We are initialze one more variable to get the count of number.
		int count = 0;
		
		//Created to while loop to check number is greater than 0.
		while(Numbers>0)
		{
			
			//We are dividing the Numbers value with 10 and remove the one number till it reaches 0.
			Numbers = Numbers/10;
			
			//It increment the value when ever the while loop execute.
			count++;
			
		}
		System.out.println("The count of the given Number is : " + count);
	}

}
