import java.io.*;
public class MultilevelInheritance{
	public static void main ( String [] args){
		person p1 = new person();
		Employee e1 = new Employee();
		FullTimeEmployee ftm = new FullTimeEmployee();
		PartTimeEmployee ptm = new PartTimeEmployee();
		p1.setPerson(" wildheart" , "california");
		e1.setEmployee("nainaram" ,"india"," nainaram7980@gmail.com"," developing");
		ftm.setFullTimeEmployee("ymnhighwatts" , "Tadipatri"," SURESHPRAJATH)@GMAIL.COM","backend",80000);
		ptm.setPartTimeEmployee("ymnhighwatts" , "Tadipatri"," SURESHPRAJATH)@GMAIL.COM","backend",10,5000);
		p1.displayPerson();
		e1.displayEmployee();
		ftm.displayFullTimeEmployee();
		ptm.displayPartTimeEmployee();
		
		
		
		
	}
}
 class person{
	protected String name;
	protected String Address;
	void setPerson( String name, String Address){
		this.name = name;
		this.Address = Address;
	}
	void displayPerson(){
		System.out.println(" Name of the person:" + this.name);
	System.out.println(" Address of the person:" + this.Address);}
}
class Employee extends person{
	protected String emailId;
	protected String Department;
	void setEmployee(String name, String Address, String emailId, String Department){
		setPerson( name,  Address);
		this.emailId = emailId;
		this.Department = Department;
	}
	void displayEmployee(){
		displayPerson();
		System.out.println(" Employee Email:" + emailId);
		System.out.println(" Employee Department :" + Department);
}}
class FullTimeEmployee extends Employee{
	double salary;
	 void setFullTimeEmployee(	String name, String Address, String emailId,String Department, double salary){
		this.salary = salary;
		setEmployee( name,  Address,  emailId,  Department);
	}
	void displayFullTimeEmployee(){
		displayEmployee();
	System.out.println(" employee salary:" + salary);}
}
class PartTimeEmployee extends FullTimeEmployee{
	double perHour;
	int hour;
	void setPartTimeEmployee(String name, String Address, String emailId,String Department,double perHour,int hour){
		this.perHour = perHour;
		this.hour = hour;
		setEmployee( name,  Address,  emailId, Department  );
	}
	void displayPartTimeEmployee(){
		System.out.println(" no. of hours your worked for are :" + hour);
		System.out.println(" Wages you  will get per hour:" + perHour);
		 System.out.println("Total salary:" + (hour*perHour));
	}
}
 
	
	