import java.io.*;
import java.util.*;
class Quadratic
{
public static void main( String [] args )
{
 System.out.println(" \n  This is the  programm for the finding the Quadratic equation .:");
int a, b, c,d;
double  r1,r2;
Scanner Sc = new Scanner ( System.in );

 System.out.println(" \n\n  Enter the  a:");
a = Sc. nextInt ();
 System.out.println(" \n\n  Enter the b:");

b  = Sc.nextInt ();
 System.out.println(" \n\n  Enter the c :");
c = Sc.nextInt ();
  d =(b*b) -(4*a*c);
System.out.println(" \n\n\n The discriminent value ");
 r1 = (-b + Math.sqrt(d))/(2*a);
r2 = ( -b - Math.sqrt(d))/(2*a);

System.out.println("  r1 ="  + r1 );

System.out.println("  r2="  + r2 );

if ( d ==0)
{System.out.println(" The roots are real and equal.");
}
else if( d > 0)
{
System.out.println(" The roots are real and distinct.");
}
else 
{
System.out.println(" The roots are  imaginary");
}
}
}