import java .io.*;
import java .lang.math;
public class MethodOverloading{
	public static void main ( String [] args){
		int radius =5;
		int a=5,b=5,c=5;
		int l=4,b=5;
		System.out.println(" This is the main method to  find the area of the \n circle \n Rectangle \n Triangle ");
		Area(radius);// calling the area method for finding the area of the circle
		Area(a,b,c);// Calling the area method for finding the area of the triangle
		Area( l,b);// calling the area method for  finding the area of the rectangle
	}
	static void Area( int radius){
			float Area = 3.14*radius*radius;
			System .out .println("Area of circle :" + Area);
	}
	static void Area ( int length,int width){
		int Area = length*width;
		System.out.println(" Area of the Rectangle:");
	}
	static void Area ( int a, int b, int,c){
		float s = Math.sqrt((a+b+c)/2);
			float Area = (s*(s-a)*(s-b)*(s-c));
			
		System.out.println(" Area of the triangle :"+ Area);
	}
			