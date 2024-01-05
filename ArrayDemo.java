import java.io.*;
import java.util.*;
public class  ArrayDemo{
	public  static void main (String[] args)
	{
		int array[]  = new int [5];
		array[0] = 26;
		array[1] = 24;
		array[2] = 34;
		array [3] = 45;
		array[4]= 32;
		int sum = 0;
		for(int i = 0; i < array.length;i++)
			sum = sum +array[i];
	//	System.out.println(array[i]);
			System.out.println(sum);
	}
}