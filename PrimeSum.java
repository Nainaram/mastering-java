import java.io.*;
import java.util.Scanner;
      public   class PrimeSum{
public static void main (String [] args){
Scanner Sc = new Scanner(System.in);
int number = Sc.nextInt();
boolean flag = false;
for ( int i = 2 ; i <= number /2; ++i){
// condition for i to be prime number
if (checkPrime(i)) { 
     
    //  condition n- i to be a prime number
   if ( checkPrime(number - i)){
     // n = primenumber1+ primenumber2
	System.out.printf("%d=%d + %d\n",number,number-i);
	flag = true;
	}
}}
if(!flag)
	System.out.println(number+ " cannot be expressed as sum of two prime numbers");
}
// Function to check  prime number 

static boolean checkPrime(int num){
boolean isPrime = true;
for (int i = 2 ; i <=num/2; ++i){
if (num % i ==0) {
isPrime = false;
break;
}}return isPrime;
}
}
