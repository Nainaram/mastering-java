import java.io.*;
import java.util.*;
public class LargestAmong{
public static void main (String[] args){
	int a , b, c;
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the number A Compare the largest:");
	a = sc.nextInt();
	System.out.println(" enter the number B compare the largest:");
	
	b= sc.nextInt();
	System.out.println(" enter the number C compare the largest:");
	
	c= sc.nextInt();
	
	if ( a >= b && a>=c)
	{
		System.out.println(a + " is the largest number!");
	}
	else  if ( b >= a &&b >= c){
		System.out.println(b + "isthe largest number ");
	}
	else {
		System.out.println(c + " is the largest number ");
}
}
}

		
	