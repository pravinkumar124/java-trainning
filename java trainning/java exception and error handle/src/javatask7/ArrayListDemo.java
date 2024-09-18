package javatask7;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
       
        ArrayList<String> list = new ArrayList<>();
        list.add("ram");
        list.add("ajay");
        list.add("sathish");
        list.add("siva");
       
        System.out.println("List before removal: " + list);
        
        list.clear();
        
        System.out.println("List after removal: " + list);
    }
}
