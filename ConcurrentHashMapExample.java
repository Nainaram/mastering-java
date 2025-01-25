import java.util.concurrent.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException{
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Add entries
        map.put(1, "One");
        map.put(2, "Two");

        // Access in multiple threads
        Runnable readTask = () -> map.forEach((key, value) -> 
            System.out.println(Thread.currentThread().getName() + ": " + key + " -> " + value));

        Runnable writeTask = () -> {
            map.put(3, "Three");
            System.out.println(Thread.currentThread().getName() + ": Added 3 -> Three");
        };

        // Create threads
        Thread thread1 = new Thread(readTask);
        Thread thread2 = new Thread(writeTask);
        Thread thread3 = new Thread(readTask);

        thread1.setName("Naina");
        thread2.setName("ram");
        thread3.setName("shyma");
        thread1.join();
        thread2.join();
        thread3.join();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
