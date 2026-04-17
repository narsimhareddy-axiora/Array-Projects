package Strings;

import java.util.Scanner;


public class stringexample {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string name = " );
		
		String input = sc.nextLine();
		System.out.println("Upper case = "+ input.toUpperCase());
		System.out.println("Lower csae = " + input.toLowerCase());
		System.out.println("Enter word to check = ");
		String word = sc.nextLine();
		
		if(input.contains(word)) {
			
			System.out.println(" The string does COntains = " + word );
						
		}
		else {
			System.out.println("The string does NOT contains = " + word);
			
		}
		System.out.println("Lenght of string = " + input.length());
		
		if (input.length()>7) {
			System.out.println("Substring (first 7 Charcaters)" + input.substring(0,7));
			
		} else {
			System.out.println("String is too short for substring example");
			
			sc.close();
		}
		
	}

}
