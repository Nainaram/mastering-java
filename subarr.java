import java.util.Scanner;

public class subarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr [] =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int count =0;
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        for(int i=0;i<=arr.length-size;i++){
            int sum =0;
            for(int j = i;j<i+size;j++){
                sum+=arr[j];
            }
            if(sum==k){
                count++;
            }
        }
        System.out.print(count);
    }
}
