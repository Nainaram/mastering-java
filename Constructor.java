import java.io.*;
class Constructor{
	public static void main(String[] args){
		Derived obj = new Derived();
			Base obj1 = new Base();
		obj.displayij();
	
}
}
class Base{
	int i = 20 ;
	void Base(){
		System.out.println(
	System.out.println(i);}
	void printi(){
	System.out.println(i);}
}
class Derived extends Base{
	int j;
	void Derived(){
	System.out.println(j);
			System.out.println(i);
}
	void displayij(){
		System.out.println(i);
		System.out.println(j);
	}
} 	