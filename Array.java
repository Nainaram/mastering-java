import java .io.*;
import java .util.*;
class Array
{
 public static void main ( String []  args)
{
     int i , flag = 0,temp;
     int a[]= new int[10];
     Scanner Sc = new Scanner ( System.in );
     System . out . println( "  Enter the values :");
     for( i = 0 ; i < 5; i++)
        {
          temp  = Sc.nextInt( );
           flag = 0;
            if ( temp  > 10 && temp < 100)
               {  
                 for (int j = 0;j++)
                    {
                       if (a[j] ==temp)
                          {
                             flag = 1;
                          }
                         if (flag =0)
                          {
                             a[i] = temp;
                               i++;
                          }
                        else  
                          {
                                System.out.println( System.out.println(" nUMBER ALREADY ENTERED");
                          }
                     else
                        {
                             System.out.pritnln( Numbers in THE arrayare:");
                                for(int j = 0; j <5;j++)
                                        System.out . println(a[j]);
                                                  }
         }
        }
}                                 




   