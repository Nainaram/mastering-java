public class ArrayDemo2{
public static void main (String [] args)
{
	int marks[] = {23,34,34,45,45};
	int sum=0,count=0;
	for ( int i = 0; i <marks.length;i++){
		sum = sum + marks[i];
	if (marks[i] >=45)
		count++;
	
	}
	System.out.println(" total marks:"+sum);
	System.out.println(" count of marks above 30 is :" +count);
	
}
}