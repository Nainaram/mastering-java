import java.util.*;
public class Num{
	public static void main(String[] args){
		int i,j, n;
		Scanner Sc = new Scanner(System.in);
		n = Sc.nextInt();
			for( i  = 0; i < n;i++){
				for (j = n-i;j>1;j --){
					System.out.print(" ");
				}
				for(j = 0;j<=i;j++){
					System.out.print("* ");
				}
				System.out.println();
			}
	}
}
				