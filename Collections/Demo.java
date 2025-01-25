import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        ListIterator li = list.listIterator();
        System.out.println("forwar direction");
        while(li.hasNext()){
            System.out.println(li.next()+" ");
            System.out.println(li.nextIndex());
        }
        System.out.println("reverse direction");
        while(li.hasPrevious()){
            System.out.println(li.previous()+" ");
            System.out.println(li.previousIndex());
        }
        li = list.listIterator();
        while (li.hasNext()) {
                if(li.next().equals("banana")){
                    li.remove();
                }
                else if (li.next().equals("apple")){
                    li.set("chiko");
                }
                else if ( li.next().equals("cherry")){
                    li.remove();
                    li.add("carrot");
                }
        }
        for(String f : list){
            System.out.print(f+" ");
        }
    }
}
