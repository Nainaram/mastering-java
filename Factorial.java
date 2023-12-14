import java.io.*;
class Fact {
  // This is a recursive function.
  long factR(int n) {
    	long result;
    	if(n==1) return 1;
    	result = factR(n-1) * n;
    	return result;
  }
}
class Factorial {
  public static void main(String[] args) throws IOException{
    	Fact f = new Fact();
    	int i,n;
    	InputStreamReader obj=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(obj);
	System.out.println("Enter n ");
	n=Integer.parseInt(br.readLine());
    	System.out.println("Factorials from 1 to  "+ n);
    	for(i=1;i<=n;i++)
	{
    		System.out.println("Factorial of "+i+" is " + f.factR(i));
    	}
   }
}