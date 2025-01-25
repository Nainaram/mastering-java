import java.util.Scanner;

public class printsubarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr [] =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
      
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        for(int i=0;i<=arr.length-size;i++){
            int sum =0;
            for(int j = i;j<i+size;j++){
                sum+=arr[j];
            }
            if(sum==k){
                // for(int j = i;j<i+size;j++){
                //     System.out.print(arr[j]+" ");
                // }
                // System.out.println();
                arr[j]
            }
        }
        
    }
}
