import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList  <Integer>list  = new ArrayList<>();
        ArrayList <Integer> list2  = new ArrayList<>();
        
        list.add(12);
        list.add(9);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
        list2.addAll(list);
        // list.set(3 ,45);
        System.out.println(list.size());
       System.out.println(list2.containsAll(list));
        System.out.println(list.get(2));

    }
}
