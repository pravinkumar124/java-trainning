package javatasks;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        int seniorCitizenAge = 65;

	        if (age >= seniorCitizenAge) {
	            System.out.println("You are a senior citizen.");
	        } else {
	            System.out.println("You are not a senior citizen.");
	        }

	        scanner.close();
	    }
	
	}


