import java .io.*;
public  class Factorialdemo{
	public static void main (String [] args){
	/*p();}
	static void p(){
	System.out.println("Hello!");
	p();
	}*/
	// RecursiveAction
	int n = 5;
	factorial(n);
	
	
	
}
	/*int factorial(int num){
	if(num ==1){
		return 1;
	}
	else {
		return num*(num-1);
	}
	System.out.println(num);*/
	static void factorial(int num){
		int fact=1;	
	for( int i =1; i <= num ;i++)
		  fact = fact*i;
	System.out.println(fact);
	}}

