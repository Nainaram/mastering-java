import java.util.*;
public class rearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int num = n+1;
        int sum =num*(num+1)/2;
        int arrsum =0;
        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];
        }
        System.out.print(sum-arrsum);
        

    }
}
