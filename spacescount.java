import java.util.*;
public class spacescount{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input  =sc.nextLine();
        int count = 0;
        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)==' '&&input.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.print(input.charAt(0)==' '?count:count+1);
    }
}