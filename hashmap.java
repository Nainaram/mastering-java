import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        TreeMap<String ,Integer> map = new TreeMap<>();
            map.put("India",1000);
            map.put("Bangkok",459);
            map.put("Japan",500);
            map.put("Europe",2332);
            map.put("America",1234);
            map.put("Srilanka",3434);
            Set <String> keys = map.keySet();
            for(String key :keys){
                int value = map.get(key);
                System.out.println(key+ " : "+ value);
            }
}
}
