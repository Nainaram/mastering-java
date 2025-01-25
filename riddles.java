import java.util.Scanner;

public class riddles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Choose a number ");
        int num = sc.nextInt() ;
        int k =num;
    num =num+num;
    num = num+6;
    num = num/2;
    num = num -k;
System.out.println(num);   }
}
