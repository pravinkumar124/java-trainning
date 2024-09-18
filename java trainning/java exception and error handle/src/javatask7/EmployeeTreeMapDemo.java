package javatask7;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMapDemo {
    public static void main(String[] args) {
        // Create a TreeMap with employee IDs as keys and names as values
        TreeMap<Integer, String> employees = new TreeMap<>();

        // Adding some employee IDs and names to the TreeMap
        employees.put(1001, "Ali");
        employees.put(1002, "Babu");
        employees.put(1003, "Charlie");
        employees.put(1004, "David");
        employees.put(1005, "Eve");

        // Print the employee names in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}