import java.io.*;
public class BinarySearch{
	int binarysearch(int arr[], int x)
	{
		int l = 0 , r = arr.length-1;
		while(l<= r){
			int m=1 +(r-1)/2;
		if(arr[m]==x)
		return m;
		if (arr[m] <x)
			return l  = m+	1;
		else 
			r = m-1;

		
		}
		return -1;
	}
	// driver code
public static void main(String args[]){
	BinarySearch obj = new BinarySearch();
	int arr[] = { 2,3,5,6,7,12};
	int n = arr.length;
	int x = 12;
	int result = obj.binarysearch(arr,x);
	if(result == -1)
		System.out.println(
			"Element is not present in arry");
		else
			System.out.println("Element is present at " + "index" + result);
	
}}