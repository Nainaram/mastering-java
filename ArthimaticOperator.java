import java.io.*;
import java.util.*;
public class ArthimaticOperator{
public static void main(String [] args)
{
Scanner Sc = new Scanner(System.in);
int n1,n2,sum,diff,pro,div,mod;
System.out.println(" Enter the value for n1 and n2 : ");
n1 =Sc.nextInt();
n2 = Sc.nextInt();
sum = n1+n2;
System.out.println("Summation of the n1 and n2:"+ sum);
diff =n1 - n2;
System.out.println("Difference of the n1 and n2:"+ diff);
pro = n1*n2;
System.out.println(" product of the n1 and n2:" + pro);
div = n1/n2;
System.out.println("Division of the n1 and n2:" + div);
mod =n1%n2;
System.out.println("Remainder of the n1 and n2:" + mod); 
System.out.println(" Enter the number for the increment and decrement operator:");
   	int num = Sc.nextInt();
	int postincre = num ++;
	int preincre = ++ num;
	int postdecre = num --;
	int predecre = -- num;
	System.out.println(" post increment value of " + num +"is:" +postincre);
	System.out.println(" pre  increment value of " + num +"is:" +preincre);
	System.out.println(" post decrement value of " + num +"is:" +postdecre);
	System.out.println(" pre decrement value of " + num +"is:" +predecre);
}
}