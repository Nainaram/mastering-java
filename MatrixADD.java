import java.io.*;
class Matrix{
	int i,j;
	void Read(int mat[][],int r,int c)throws IOException{
	  	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  	for( i=0;i<r;i++)
	  	{
			for(j=0;j<c;j++)
			{
				mat[i][j]=Integer.parseInt(br.readLine());
			}
	  	}
	}	
	void Display(int sum[][],int r,int c){
		for( i=0;i<r;i++)
		{
			for( j=0;j<c;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	  }
}
public class MatrixADD {
	 public static void main(String args[])throws IOException{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int[][] a=new int[10][10];
	  int[][] b=new int[10][10];
	  int[][] c=new int[10][10];
	  int i,j;
 	  Matrix m=new Matrix();
	  System.out.println("enter no of rows and cloumns of matrix 1");
	  int row1=Integer.parseInt(br.readLine());
	  int col1=Integer.parseInt(br.readLine());
	  System.out.println("enter no of rows and cloumns of matrix 2");
	  int row2=Integer.parseInt(br.readLine());
 	  int col2=Integer.parseInt(br.readLine());
	  if(row1==row2&&col1==col2)
	  {
	 	System.out.println("Matrix addition is possibel");
		System.out.println("Enter elements of Matrix1 row wise");
		m.Read(a,row1,col1);
		System.out.println("Enter elements of Matrix2 row wise");
		m.Read(b,row2,col2);
		for(i=0;i<row1;i++){
			for(j=0;j<col1;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of two matrices is :");
		m.Display(c,row1,col1);
 	 }
	 else
	 {
		System.out.println("Matrix addition is not possible");
	 }
 }
}