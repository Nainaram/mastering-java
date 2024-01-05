import java.io.*;
public class Inheritance {
	public static void main (String[] args){
		Employee emp = new Employee();
		FullTimeEmployee  str = new FullTimeEmployee();
		
		emp.setEmployee(102,"vikramsingh");
		str.setFullTimeEmployee(102,"rajusingh","ramji",75000);
				str.printFullTimeEmployee();
		emp.printEmployee();
		}
}
 class Employee{
	protected int empId;
	protected String Empname;
	void  setEmployee(int empId,String Empname){
		this.empId=empId;
		this.Empname = Empname;
	}
	void printEmployee(){
		System.out.println(" Employee id is :" + empId);
		System.out.println(" Employee name is :" + this.Empname);
}}
 class FullTimeEmployee extends Employee{
	 private String email;
	 private int salary;
	 void setFullTimeEmployee(int empId,String Empname,String email,int salary){
		 //setEmployee(empId,Empname);
		 this.empId = empId;
		 this.Empname = Empname;
		 this.email = email;
		 this.salary = salary;
	 }
	 void printFullTimeEmployee(){
		 //printEmployee();
		 System.out.println(" Employee Name:" + Empname);
		 System.out.println("Employee ID:"+ empId);
		 System.out.println("Employee email:" + email);
	 System.out.println(" Employee salary :" + salary);
	 }
	 
}