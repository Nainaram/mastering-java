import javax.swing.*;
import java.awt.event.*;
public class TextFieldExample2 implements ActionListener{
JTextField tf1,tf2,tf4;
JButton b1;
TextFieldExample2(){
JFrame f= new JFrame();
tf1=new JTextField();
tf1.setBounds(50,50,150,20);
tf2=new JTextField();
tf2.setBounds(50,100,150,20);
tf4=new JTextField();
tf4.setBounds(50,300,150,20);
b1=new JButton("Add");
b1.setBounds(50,200,50,50);
b1.addActionListener(this);
f.add(tf1);f.add(tf2);f.add(tf4);f.add(b1);
f.setSize(800,800);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
String s1=tf1.getText();
int a=Integer.parseInt(s1);
String d=Integer.toBinaryString(a);
tf4.setText(String.valueOf(d));
}
public static void main(String[] args) {
new TextFieldExample2();
}
}