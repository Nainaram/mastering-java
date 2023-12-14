import java.util.*;
import javax.swing.*;
public class Calculator
{
public static void main(String[] arg)
{
String input1,input2,operator;
Double operand1,operand2;
input1 = JOptionPane.showInputDialog("Enter 1st Value");
operator = JOptionPane.showInputDialog("Enter Operator(+,-,*,%./)"); input2 =
JOptionPane.showInputDialog("Enter 2nd Value");

operand1=Double.parseDouble(input1);
operand2=Double.parseDouble(input2);
double result;
if (operator.equals("+")) result
= operand1+operand2; else
if(operator.equals("-")) result =
operand1-operand2; else
if(operator.equals("*")) result =
operand1*operand2; else
if(operator.equals("/")) result =
operand1/operand2; else
if(operator.equals("%")) result
= operand1%operand2; else
JOptionPane.showMessageDialog(null, "Inappropriate Input");
JOptionPane.showMessageDialog(null,"Your results are " + result);
}
// TODO Auto-generated method stub

private static double operand2(double result) {
return 0;
}
}