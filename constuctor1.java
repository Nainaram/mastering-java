import java.io.*;
public class constuctor1{
	public static void main(String [] args){
		Derived obj = new Derived ();
	     obj.printij();}
	}
class Base{
	protected int i ;
	public  Base(){
		int i = 20;
	System.out.println("its the base class");}
 public	void printi(){
	System.out.println( "i" + i);}
}
class Derived extends Base{
	int j;
	public  Derived (){
		int j= 30;
	System.out.println(" its the Derived class");}
	public 	 void printij(){
	System.out.println('i'  +i);
System.out.println("j"+j);}}