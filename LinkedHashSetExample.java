import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        
        System.out.println("LinkedHashSet: " + set);
        set.add("beauty");// added the element at the last of the hashset
        System.out.println(set);
    }
}
