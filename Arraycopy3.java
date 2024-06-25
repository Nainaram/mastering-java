import java.io.*;
public class Arraycopy3{
public static void main ( String [] args ){
	char [] copyfrom ={'n','a','i','n','a','r','a','m'};
//har[] copyto = new char[10];
	char[] copyto= {'n','a','i','n','a','r','a','m'};
	System.arraycopy(copyfrom,5,copyto,0,3);
	System.out.println(copyto);
}
}