package javatask7;
import java.util.Scanner;

public class StringIndexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Rajesh";

        System.out.print("Enter a string index to access: ");
        try {
            int index = scanner.nextInt();
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}