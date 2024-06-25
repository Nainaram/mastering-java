import java.io.*;
import java.util.*;

public class IfElseLadder{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
/*System.out.println( " Enter the temperature:");

 int temperature = sc.nextInt();
	if(temperature <0){
	System.out.println("its  a ice cool");}
	else if ( temperature >= 100 ){
	System.out.println(" its a vapour temperature");}
	else{
		System.out.println("its a normal temperature!");
	}*/
	System.out.println(" enter your score:");
	
	int marks = sc.nextInt();
	if( marks <40){
	System.out.println(" your are FAILED!!!");}
	else if ( marks < 60){
		System.out.println(" you are passed by third class");
	}
	else if( marks < 80){
		System.out.println(" you are passed by second class");
	}
	else if ( marks < 90){
		System.out.println(" you are passed by first class");
	}
	else 
	{
	System.out.println(" you're out standing");
	}
System.out.println(" thanks for using my programm!");
}
}
