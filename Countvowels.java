import java.io.*;
class CountVowels{
	public static void main(String[ ] args) throws IOException{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		String str=new String( );
		System.out.println("Enter a string");
		str=br.readLine( );	
		int ln=str.length( );
		System.out.println("String length is"+ln);
		int d=0,v=0,s=0,c=0;
		for(int i=0;i<ln;i++)
		{
			char ch=str.charAt(i);
			if(((ch>='a') && (ch<='z')) || ((ch>='A') && (ch<='Z')))
			{
				if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u')
					v++;
				else if(ch=='A'|| ch=='E'|| ch=='I' || ch=='O' || ch=='U')
					v++;
				else
					c++;
			}
			else if(ch>='0' && ch<='9')
               		 d++;
			else
				s++;
	    	}
		System.out.println("Digits "+d);
		System.out.println("Vowels "+v);
		System.out.println("Consonents "+c);
		System.out.println("Special Characters "+s);
	}
}