import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        System.out.println("HashMap: " + map);
        
        // Accessing value
        System.out.println("Value for 'Banana': " + map.get("Banana"));
        
        // Removing an entry
        map.remove("Cherry");
        System.out.println("After removal: " + map);
    }
}
