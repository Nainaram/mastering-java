import java.util.concurrent.*;
public class ConcurrentExample {
public static void main(String[] args) {
ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
map.put(1, "One");
map.put(2, "Two");
map.forEach((key, value) -> System.out.println(key + " -> " + value));
}
}