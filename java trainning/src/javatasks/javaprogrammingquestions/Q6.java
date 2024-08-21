package javaprogrammingquestions;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the room rent per day: ");
        float roomRentPerDay = scanner.nextFloat();
        
        System.out.print("Enter the number of days stayed: ");
        int daysStayed = scanner.nextInt();
      
        float totalTariff;
     
        switch (month) {
            case 4: case 5: case 6: 
            case 11: case 12:       
                totalTariff = roomRentPerDay * daysStayed * 1.20f; 
                break;
            default:
                totalTariff = roomRentPerDay * daysStayed; 
                break;
        }
      
        System.out.printf("Total hotel tariff to be paid: %.2f\n", totalTariff);
       
        scanner.close();
    }


	}


