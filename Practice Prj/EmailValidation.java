package javafsd;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
// Storing list of emaiSTRING an array
		Scanner sc = new Scanner(System.in);
		// Storing list of emailid in an array
		String Array[] = { "max@gmail.com", "vidhya23@gmail.com", "amala@gmail.com", "sami@gmail.com",
				"amazon.ino", "vicky22@gmail.com", "john@gmail.com", "mani853@gmail.com", "siva@gmail.com",
				"yahoo@gmail.com", "123@gmail.com" };

		System.out.println("Enter the EmailId to search");
		// Get input from user to search emailid
		String s = sc.next();
		// Validating email

		for (int i = 0; i < Array.length; i++) {
			  
		       if(Array[i].equals(s))
		       {
		       
		    	   System.out.println("EmailId validated");
		           break;
		       }
		      else {
		    	  System.out.println("Invalid email");
		      }
		}
	}
}