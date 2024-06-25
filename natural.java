import java .io.*;
import java.util.*;
public class natural{
	public static void main(String[] args){
		int i,n;
		Scanner Sc = new Scanner(System.in);
		System.out.println("ENTER THE n VALUE:");
		n = Sc.nextInt();
		//r( i =n-1;i >=1;i--){
			//stem.out.println(i);
			i=n;
			do{
			System.out.println(i);
			
			i--;
			if(i == 9 ){
				System.out.println("continue stmt executed");
			continue;}
			if(i == 7){
				System.out.println(7);
				System.out.println("break the loop");
			break;}}
			while(i>=1);
			
	}
}