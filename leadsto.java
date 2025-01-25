import java.util.*;
public class leadsto {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(" ");
        TreeMap<String,Integer> map = new TreeMap<>();
        for(String i:arr){
            // if(map.containsKey(s)){
            //     int val = map.get(s);
            //     map.put(s,val+1);
            // }
            // else{
            //     map.put(s,1);
            // }
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        Set <String> set = map.keySet();
        for(String st: set ){
                int v = map.get(st);
            if(v>3){

                System.out.println(st);
            }
        }
    }
}
