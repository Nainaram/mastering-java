import java .io.*;
public class ClassDemo{
	
 char setname(char  name){
	return name;}
	 char getname( char name){
	return name;}
	float  setmarks(float marks){
	return marks;}
	 float getmarks( float marks){
		return marks;
	}
	int  setrollno( int rollno){
	return rollno;}
	int  getrollno(int rollno){
	return rollno;}
public static void main ( String[] args){
	ClassDemo sc = new ClassDemo();
	sc.setname(ram);
	sc.setrollno(576);
	sc.setmarks(99);
	int marks = sc.getmarks();
	String name = sc.getname();
	int rollno = sc.getrollno();
	 System.out.println(" Marks are :" + marks);
	 
	System.out.println("Name :" + name );
	 System.out.println(" rollno:" +rollno );
}
}

	