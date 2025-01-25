import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethodsExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        
        // Add elements
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");
        System.out.println("Collection: " + collection);
        
        // Size
        System.out.println("Size: " + collection.size());
        
        // Iterate
        for (String item : collection) {
            System.out.println("Item: " + item);
        }
        
        // Remove element
        collection.remove("Banana");
        System.out.println("After removal: " + collection);
        
        // Add all elements from another collection
        Collection<String> additionalItems = new ArrayList<>();
        additionalItems.add("Date");
        additionalItems.add("Elderberry");
        collection.addAll(additionalItems);
        System.out.println("After addAll: " + collection);
        
        // Remove all elements from another collection
        collection.removeAll(additionalItems);
        System.out.println("After removeAll: " + collection);
        
        // Clear the collection
        collection.clear();
        System.out.println("After clear: " + collection);
    }
}
