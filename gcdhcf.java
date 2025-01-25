import java.util.*;
public class gcdhcf {
    public static int Lcm(int a , int b){
        return (a*b)/eculidgcd(a, b);
    }
    public static int eculidgcd(int a,int b){
        while(b!=0&&a!=0){
            if(a>b){
                a=a%b;
            }
            else{b=b%a;}
        }
        if(a!=0){
            return a;
        }
        else{
        return b;
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max =0;
        if(a>b){
            max = a;
        }
        else{
            max = b;
        }
        System.out.print(Lcm(a, b));
    }
}
