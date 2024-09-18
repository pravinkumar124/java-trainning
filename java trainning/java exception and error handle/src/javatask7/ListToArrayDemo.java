package javatask7;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayDemo {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Cherry");

        String[] array = list.toArray(new String[0]);

        System.out.println("Array contents:");
        for (String item : array) {
            System.out.println(item);
        }
    }
}