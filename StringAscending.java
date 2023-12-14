import java.lang.*;
import java.io.*;
class StringAscending{
	public static void main(String args[ ])throws IOException{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.print("enter how many strings");
		int n=Integer.parseInt(br.readLine( ));
		String[ ] str=new String[n];
		System.out.println("Enter "+n+" strings");
		for(int i=0;i<n;i++)
		{
			str[i]=br.readLine( );	
		}
		String temp=new String( );
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("Strings in alphebetical order are");
		for(String x:str)
		{
			System.out.println(x);
		}
	 }
}