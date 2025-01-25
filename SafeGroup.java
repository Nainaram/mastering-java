import java.util.*;
public class SafeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr [] = new int [num];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        safeGroupsnums(arr);
    }
    public static void safeGroupsnums(int [] arr){
        HashSet<Integer> freq = new HashSet<>();
        int count =0;
        for(int i:arr){
            if(freq.contains(i)){
                count++;
                freq.clear();
            }
            else{
                freq.add(i);
            }
        }
        System.out.println(count);
    }
}
