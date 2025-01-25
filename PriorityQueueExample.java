import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Banana");
        queue.add("Apple");
        queue.add("Cherry");
        
        System.out.println("PriorityQueue: " + queue);
        
        // Poll elements (removes and returns)
        System.out.println("Polling: " + queue.poll());
        System.out.println("After polling: " + queue);
        System.out.println("Polling: " + queue.poll());
        System.out.println("After polling: " + queue);
    }
}
