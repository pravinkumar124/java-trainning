package javaprogrammingquestions;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("I");
            } else if (i % 2 == 0) {
                System.out.println("**");
            } else {
                System.out.println("*");
            }
        }
        
        scanner.close();
    }


	}


