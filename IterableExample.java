
    // collection of the interfaces and classes 
    // iterable-> collection-> list,queue,set
    // methods of collections add,size,remove,iterate,addAll,removeAll,clear
    // linkedlist -> Arrays, linkedList,vector,stack
    // Queue ->PriorityQueue , LinkedList ,Deque->ArrayDeque
    // Set ->Hashset ,LinkedHashset,Sortedset->Treeset
    // MapInterface ->HashMap, LinikedHashMap,SortedMap->TreeMAP ,Hashtable

import java.util.ArrayList;
import java.util.Iterator;

public class IterableExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext() ) {
            System.out.println(iterator.next());
        }
    }
}
