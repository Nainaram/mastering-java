import java.io.*;
import java.util.*;
class Fibonacci {
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
 int n  ,firstTerm = 0, SecondTerm = 1;
System.out.println(" Enter the number upto display the fibonacci series:");
n= sc.nextInt();
System.out.println("Fibonacci Series till " + n + " terms\n:");
for  ( int i = 1; i <= n ; i++)
{
 System.out.println("\n"+firstTerm + ",");
// Compute the next term
int nextTerm= firstTerm  + SecondTerm;
firstTerm = SecondTerm;
SecondTerm = nextTerm;}
}
}