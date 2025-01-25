import java.util.*;
public class uniqcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr  [] =new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            boolean isunique = true;
            for(int j =0;j<arr.length;j++){
                if(arr[i]==arr[j]&&i!=j){
                    isunique = false;
                }
            }
        
        if(isunique){count++;}
        }
        System.out.print(count);    }
}
