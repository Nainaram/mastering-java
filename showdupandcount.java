import java.util.*;
public class showdupandcount {
    public static void main(String[] args) {
        String s = "mississippi";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();  
    for(char ch : s.toCharArray()){
               
                if(map.containsKey(ch)){
                    int val = map.get(ch);
                    map.put(ch, val+1);
                }
                else{

                    map.put(ch,1);
                }
    } 
            Set <Character> set  = map.keySet();
            String st ="";
    for(char ch:set)   {
        int vals = map.get(ch);
        st = st+ch+vals;
 }
 System.out.print(st);
}
}
