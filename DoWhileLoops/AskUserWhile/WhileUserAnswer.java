package AskUserWhile;

import java.util.Scanner;

public class WhileUserAnswer 
{	
	
	public static void main(String[] args)
	
	{

		
		String y = "";
		String n = "";
		String userInput = ""; 
	
		// TODO Auto-generated method stub
		
		  Scanner input = new Scanner(System.in); // instantiating the scanner object
		  
		 
		 System.out.print("Please enter y or n  "+ userInput); // asking for user input
		 userInput = input.nextLine();	
		 
		
		do
		{ 
			if ((userInput.equals("y")) || (userInput.equals("n"))) // Prompting the user to enter y or n
				
			{
				System.out.println("Please continue" ); 
				
				userInput = input.next();
				
				 // Message to alert the user of their choice	
			}
		
			else 
			{
				System.out.println("Invalid option please enter only y or n");
				
				userInput = input.next();
				
			
				
			}  //if not any of the above choices chosen print this message
			
		}  
		
		while 
			(!userInput.equalsIgnoreCase("n"));
		
			userInput = input.next();
	

	}

}
