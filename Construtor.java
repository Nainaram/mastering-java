import java.io.*;
class Constructor{
	System.out.println(String[] args){
		Derived obj = new Derived();
		obj.displayij();
}
}
class Base{
	int i ;
	void printi(){
	System.out.println(i);}
}
class Derived extends Base{
	int j;
	void displayij(){
		System.out.println(i);
		System.out.println(j);
	}
}