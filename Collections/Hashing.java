import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hashing {
    public static void main(String[] args) {
        TreeMap<String ,Integer> freq = new TreeMap<>();
        freq.put("srikanth", 1000);
        freq.put("kiran", 890);
        freq.put("raja",34);
        freq.put("lamma", 143);
        freq.put("virat", 90);
        Set<Entry<String,Integer>> entry = freq.entrySet();
        for(Entry<String,Integer> en : entry){
            // System.out.println(en);
            System.out.println(en.getKey()+" "+ en.getValue());
        }
        for( String i : freq.keySet()){
            // System.out.println(en);
            System.out.println(freq.get(i));
        }
    }
}
