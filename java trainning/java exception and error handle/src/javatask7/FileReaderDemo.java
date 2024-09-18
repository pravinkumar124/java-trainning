package javatask7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name to read: ");
        String fileName = scanner.nextLine();
        
        try {
            // Attempt to open and read the file
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' does not exist.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}
