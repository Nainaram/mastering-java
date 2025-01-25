import java.util.*;
public class printall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr [] =new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] =scanner.nextInt();
        }
        for(int len = 1;len<=arr.length;len++)
        {
            for(int i=0;i<=arr.length-len;i++)
            {
                for(int j =i;j<i+len;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
