import java.io.*;
public  class AsciiValue {
public static void main ( String [] args)
{
char ch = 'a';
int ascii =ch;
// you can also cast character to int
int castAscii = (int) ch;
System.out.println("The ASCII value of " +ch +"is:" + ascii);
System.out.println("The ASCII value of " + ch + "is:" + castAscii);
}
}
