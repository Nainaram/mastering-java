import java.util.*;
public class findmissingnum {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            int arr []  = new int [n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int num = n +1;
            int sum =0;
            num = num*(num+1)/2;
            for(int i:arr){
                sum+=i;
            }
            System.out.print(num-sum);
        }
}
