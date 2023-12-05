
import java.util.Scanner;

public class Nina {
    static {
        System.out.println("\n\t Reverse String \n");
    }

    final static public void main(String... a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t Enter the string : ");
        String str = sc.nextLine();
        System.out.printf("\n\t Original String : %s", str);

        char ch[] = str.toCharArray();

        int i = 0, j = ch.length - 1;
        char temp;
        while (i < j) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;

        }
        String r=new String(ch);
        System.out.print("\n\t Reversed string : " + r);

    }

}
