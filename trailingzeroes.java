import java.util.*;
public class trailingzeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int powOf5 =5;
        int res =0;
        while(n>=powOf5){
            res=res+n/powOf5;
            powOf5*=5;
        }
        System.out.println(res);
    }
}
