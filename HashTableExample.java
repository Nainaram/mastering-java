import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Apple", 1);
        table.put("Banana", 2);
        table.put("Cherry", 3);
        
        System.out.println("Hashtable: " + table);
        
        // Accessing value
        System.out.println("Value for 'Banana': " + table.get("Banana"));
    }
}
