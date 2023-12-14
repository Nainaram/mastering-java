import java .io.*;
import java .util.*;
class Bill {
public static void main ( String [] args )
 {
 System.out .println("This is the programm for the Electricity");
 int  prev ,current, enumb;
 String cname , Ebconnection;
double units;
Scanner Sc =  new Scanner ( System.in);
 System. out .println(" Enter the consumer number :");
cname =  Sc.next();
System.out.println(" enter the prevoius bill reading:");
 prev =  Sc.nextInt();
System.out.println(" Enter the current readiing:");
 current = Sc.nextInt();
System.out.println(" Enter teh electric board connection: \t 1.Domestic \t2. Commercial");
int option = Sc.nextInt();

switch(option)
{
case 1:
  units = current - prev ;
if (units == 100)
 double amount = units *1;
else if( units >= 100 && units <= 200)
amount = units* 2.5;
else if( units > 200 && units < 500)
amount = units * 4;
else 
    System.out.println( +  amount);
break;
case 2:
  units = current - prev ;
if (units == 100)
 double amount = units*2;
else if( units >=  100 && units <=200)
amount = units* 4;
else if( units >200 && units <500)
amount = units * 7;
else 
    System.out.println( +  amount);
break;
}
}
}