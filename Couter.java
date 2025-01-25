import java.util.*;
public class Couter{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to print the all digits of that number.");
        int num =sc.nextInt();
        int ar [] =new int[5];
        for(int i = 1;i<=num;i++){
            int d=num%10;
            ar[i] =d;
            num = num/10;
            System.out.println(ar[i]);
 }
        sc.close();
    } 
}