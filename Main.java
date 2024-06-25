import java.io.*;
import java .util.*;
public class Main {
public static void main ( String [] args){
// Scanner class to take dynamic input from user
Scanner sc = new Scanner( System.in);

 // value a , b and c
double a ,b,c;
double root1,root2;
//taking inputs values
System.out.println(" Enter the values for the a:");
a = sc.nextFloat();
System.out.println(" Enter the values for the b:");
b= sc.nextFloat();
System.out.println(" Enter the values for the c:");
c = sc.nextFloat();
//calculate the determinent((b2 - 4ac))
double determinant = b*b-4*a *c;
// check if determinant is greater than 0 
if (determinant>0) {
 // two real and distint roots
root1 = (-b + Math.sqrt(determinant))/(2* a);
root2 = (-b- Math.sqrt(determinant))/(2*a);
System.out.format(" root1 = %.2f and root2 = %.2f",root1,root2);
}
// check if determinant is equal to 0 
else if ( determinant ==0) {
// two real and equal roots
// detrminant is equal to 0 
//so -b + 0 == -  b
root1= root2 = - b / (2*a);
System.out.format(" root1 = root2 = %.2f;",root2);
}
// if determinant is less than zero
else{ 
// roots are complex number and distinct
double real =-b/(2 *a);
double imaginary = Math.sqrt(-determinant)/(2*a);
System.out.format("root1 = %.2f+ %.2fi",real,imaginary);
System.out.format("/n root2 =  % 2f-%2fi",real,imaginary);
}
}
}





























