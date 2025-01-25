import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.addLast("mercedes");
        cars.addFirst("toyota");
        System.out.println(cars);
        for(String i : cars){
            System.out.println(i);
        }
        Iterator it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
