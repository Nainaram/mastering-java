import java.util.*;
public class printsubsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr [] =new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] =scanner.nextInt();
        }
        int k = scanner.nextInt();
        int count = 0;
        for(int len = 1;len<=arr.length;len++)
        {
            for(int i=0;i<=arr.length-len;i++)
            {
                int sum =0;
                for(int j=i;j<i+len;j++)
                {
                    sum+=arr[j];
                }
                if(sum==k)
                {
                    count++;
                }
                
            }
        }
        System.out.println(count);
    }
}
