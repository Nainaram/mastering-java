import java.io.*;
import java.util.*;

public class CheckPrime{
public static void main  ( String[] args ){
Scanner sc= new Scanner(System.in);
int i, m ,flag =0;
System.out.println("Plz enter the number to check \n Whether it is Prime or Not\n:");
int n = sc.nextInt();
m = n/2;
if (n==0 ||n==1){
System.out.println(n + " is not a primenumber");
}
else {
	for(i = 2;i<=m;i++)
	{
	 if(n%i==0) 
		 {
		System.out.println(n + " not a prime number");
		flag = 1;
		break;
		}
	}
	if(flag==0)
	{System.out.println(n+ " is prime number");
		}
	}// end of else
}
}