import java.util.*;
public class duplicate {
        public static void main(String[] args) {
            LinkedHashSet<Character> dup = new LinkedHashSet<>();
            String str = "mississippi";
            for(char ch:str.toCharArray()){
                dup.add(ch);
            }
            for(char ch:dup){
                System.out.print(ch);
            }
        }
}
