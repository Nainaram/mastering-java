import java.util.*;
public class countpairs {
    public static void main(String[] args) {
        int arr [] ={3,1,7,7,1,7,7,1,4,3};
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)){
                int val  = map.get(i);
                map.put(i,val+1);
            }
            else{
                map.put(i,1);
            }
        }
        Collection <Integer> setmap = map.values();
        int sum =0;
        for(int i: setmap){
                sum+=i/2;

        }
        System.out.println(sum);

        
    }
}
