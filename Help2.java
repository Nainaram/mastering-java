import java.io.*;
 class Help2
{
 public  static void main( String[] aarggs)
{
      do
{
    System.out.println(" 1. if");
System.out.println(" 2.  if -else");
System.out.println(" 3. if-else lader");
System.out.println("    do_ while");
System.out.println(" 4.for");
System.out.println(" 5. while");
 System.out.println(" Choose the option");
 choice  = (char)     System.in.read();
      do {      
 ignore  = (char)  System.in .read();
        }   while( ignore   !='\n');
}  while(choice <'1' |  choice  >'5');
}
}