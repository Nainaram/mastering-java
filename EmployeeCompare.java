import java.util.*;

class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String email;
    private int salary;
    public Employee (){

    }
    public Employee(int id,String name,String email,int salary){
        this.id = id;
        this.name= name;
        this.email = email;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "[ "+id+ " ,"+name+" ,"+email+" ,"+salary+" ]";
    }

    @Override
    public int compareTo(Employee o2){
        Employee o1 =this;
        Character  name1 =o1.name.charAt(o1.name.length()-1);
        Character  name2 =o2.name.charAt(o2.name.length()-1);
       
                return name1.compareTo(name2);

    }
    
}
public class EmployeeCompare {
    public static void main(String[] args) {
        Employee e1  = new Employee(1,"sundaroy","sundar@gmail.com",50000);
        Employee e2  = new Employee(2,"shahid","tim@gmail.com",100000);
        Employee e3  = new Employee(3,"shahids","shahid@gmail.com",150000);
        Employee e4  = new Employee(4,"tim","karna@gmail.com",10000);
        ArrayList<Employee> list=new ArrayList<Employee>();
             list.add(e2);
            list.add(e1);
            list.add(e4);
            list .add(e3);
            System.out.println(list);
             Collections.sort(list);
              System.out.println(list);
           
    }
}
