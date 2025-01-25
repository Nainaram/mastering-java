import java.util.*;
public class smallestsumarray{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int arr [] =new int [n];
        for(int i = 0; i <arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int minlength = Integer.MAX_VALUE;
        int start = 0;
        int end =0;
        for(int len =1;len<=arr.length;len++)
        {
            for(int i =0;i<=arr.length-len;i++)
            {
                int sum =0;
                for(int j =i;j<i+len;j++)
                {
                    sum+=arr[j];
                }
                if(isprime(sum)&&len<minlength)
                {
                    start = i;
                    end = i+len;
                    minlength = len;
                }
            }
        }
        if(minlength <Integer.MAX_VALUE)
        {
            for(int j =start;j<end;j++)
            {
                System.out.println(arr[j]+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("None");
        }
    }
    public static boolean isprime(int n)
    {
        if(n==1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if(n%2==0)
        {
            return false;
        }
        for(int i=3;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}