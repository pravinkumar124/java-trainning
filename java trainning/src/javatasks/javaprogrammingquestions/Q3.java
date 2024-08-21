package javaprogrammingquestions;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int currentNumber = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(currentNumber++);
            }
   
            System.out.println();
        }
        
        
        scanner.close();

	}

}
