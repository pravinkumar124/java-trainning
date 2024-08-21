package javaprogrammingquestions;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	      
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        if (isPalindrome(input)) {
	            System.out.println("'" + input + "' is a palindrome.");
	        } else {
	            System.out.println("'" + input + "' is not a palindrome.");
	        }
	     
	        scanner.close();
	    }
	  
	    public static boolean isPalindrome(String s) {
	        s = s.toLowerCase(); 
	        int length = s.length();
	        
	        for (int i = 0; i < length / 2; i++) {
	            if (s.charAt(i) != s.charAt(length - i - 1)) {
	                return false;
	            }
	        }
	        return true; 
	    }
	
	}


