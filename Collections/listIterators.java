import java.util.ArrayList;
import java.util.ListIterator;


public class listIterators{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        ListIterator <Integer> i = list.listIterator();
        list.set(4, 45);
        while (i.hasNext()) {
            System.out.println(i.previous()); 
            i.remove();           
        }
        System.out.println(list);
    }
}