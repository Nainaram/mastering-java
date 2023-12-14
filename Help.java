import java .io.*;
import java . util.*;

 class Help{
    public static void main( String []  argss)
{
       Scanner Sc = new Scanner ( System.in);
         System.out .println(" tHIS IS   THE HELP BOX !");
             System.out. println(" we  are here for you to help , select the option\t 1. if \n 2. switch ");
               int option = Sc.nextInt();
                 switch( option)
{
                  case 1:
                        System.out.println( "SYNTAX:  if(condition)");
                            System.out.println("\n {  body of the code .......}\n");
                          break  ;
                    case 2:
System.out.println(" SYNTAX:   switch( option)  \n ");
System.out.println("case 1:  \n{   statement }\n");
System.out.println(" break;");
System.out.println("case 2:  \n{   statement }\n");
System.out.println(" break;");

                     break ;
}
}
}
             