import java.util.ArrayList;
import java.util.Iterator;

public class Iterators{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        Iterator <Integer> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next()); 
            i.remove();           
        }
        System.out.println(list);
    }
}