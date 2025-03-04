import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        System.out.println("LinkedList: " + list);
        
        // Adding an element at the beginning
        list.addFirst("Avocado");
        // Adding an element at the end
        list.addLast("Date");
        
        System.out.println("After adding elements: " + list);
        
        // Removing elements
        list.removeFirst();
        list.removeLast();
        
        System.out.println("After removing elements: " + list);
    }
}
