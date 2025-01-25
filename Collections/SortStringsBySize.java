import java.util.Arrays;
import java.util.Comparator;

public class SortStringsBySize {
    public static void main(String[] args) {
        // Sample array of strings
        String[] strings = {"apple", "banana", "kiwi", "grape", "orange", "fig"};

        // // Sort the array based on the size of the strings
        // // Arrays.sort(strings, (str1, str2) -> Integer.compare(str1.length(), str2.length()));
        // Arrays.sort(strings,Comparator.comparingInt(String::length));

        // // Print the sorted array
        // System.out.println("Strings sorted by size:");
        // for (String str : strings) {
        //     System.out.println(str);
        // }
         
        for(int i=0;i<strings.length-1;i++){
            for(int j = 0;j<strings.length-i-1;j++){
                if(strings[j].length()>strings[j+1].length()){
                            String temp =strings[j];
                            strings[j]=strings[j+1];
                            strings[j+1] =temp;
                }
            }
        }
        for (String str : strings) {
                 System.out.println(str);
        }
    }
}
