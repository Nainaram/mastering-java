import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");
        
        System.out.println("Deque: " + deque);
        
        // Adding elements at both ends
        deque.addFirst("Avocado");
        deque.addLast("Date");
        System.out.println("After adding elements: " + deque);
        
        // Removing elements from both ends
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removing elements: " + deque);
    }
}
