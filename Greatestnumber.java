import java.io.*;
import java.util.*;
public class Greatestnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the numbers to check the greatest number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c  = sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is the greatest number" + a);
        }
        else if( b > c && b > a){
            System.out.println(" B is the greatest number" + b);
        }
        else{
            System.out.println(" C is the greatest number" + c);
        }
    }
}