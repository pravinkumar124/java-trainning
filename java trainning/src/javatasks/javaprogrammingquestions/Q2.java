package javaprogrammingquestions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversedString = reverseString(input);
        
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
    
    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        
        return reversed.toString();
    }

	}


