import java.io.*;
import java.util.*;

public class Prime{
public static void main(String [] args)
{ Scanner sc = new Scanner(System.in);
System.out.println(" enter the number to check  prime");

int n = sc.nextInt();
int i ,m = 0,flag=0;
m = n/2;
if ( n ==1|| n ==0)
{System.out.println(" its not a prime number!");
}
else{
	for ( i = 2 ; i < m ; i++)
	{
	 if ( n %2==0){
	 System.out.println(" its not a prime number!");
	 flag = 1;
	 break;}
	 }
		if(flag==0)
		{System.out.println( n+ " is a prime number");
		}
		}
		}
		}