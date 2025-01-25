import java.util.*;
public class printorder {
    public static void main(String[] args) {
        int arr [] = { 2,3,5,6,31,6,2,3,65,33};
        TreeSet<Integer> dups  = new TreeSet<>();
        for(int i :arr){
            dups.add(i);
        }
        for(int i:dups){
            System.out.print(i+" ");
        }
    }
}
