import java.util.*;
public class countvowels {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        // String vowels = "aeiou";
        int count =0;
        for(int i =0;i<input.length();i++){
            // if(vowels.contains(String.valueOf(input.charAt(i)))){
            char ch = input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
