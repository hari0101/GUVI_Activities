package guvitask4;

public class Question7 {

// 	Write a java program to print the length of the given string.
	
//  String mg ="Guvi Geek".
	
	
	public static void main(String[] args) {

	//Initialize the String variable to store the sentence.
	
		String msg = "Guvi Geek";
		
		int ch = 0;
		
		//By using For each loop we are iterating the individual character of string.
		for(char c : msg.toCharArray())
		{
			ch++;  // increment whenever for gets the value.
		}
		
		//Outputing the length of string.
		System.out.println(ch);  
		
		
	}

}
