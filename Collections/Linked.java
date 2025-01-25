import java.util.*;

public class Linked {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(null);
        list.add(null);
        list.add(null);
        LinkedList <Integer>ll  = new LinkedList<Integer>();
        ll.addFirst(45);
        ll.addFirst(34);
    ll.addFirst(23);
ll.addLast(88);  
System.out.println(ll);
ll.removeFirst();
System.out.println(ll);
ll.removeLast();
System.out.println(ll);
System.out.println(ll.getFirst());
System.out.println(ll.getLast());

}
}
