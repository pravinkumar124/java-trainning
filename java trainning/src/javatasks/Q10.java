package javatasks;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        number = Math.abs(number);

	        if (number == 0) {
	            System.out.println("Number of digits: 1");
	        } else {
	            int digitCount = 0;
	            while (number > 0) {
	                number /= 10;
	                digitCount++;
	            }
	            System.out.println("Number of digits: " + digitCount);
	        }

	        scanner.close();
	    }
	
	}


