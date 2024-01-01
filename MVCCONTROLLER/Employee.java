// class that represents model
public class Employee {
    // declaring the varibles
    private String EmployeeName;
    private String EmployeeID;
    private String EmployeeDepart;
    // Defining getter and sette methods
    public String getID(){
        return EmployeeID;
    }
    public void setID(String id){
        this.EmployeeID = id;

    }
    public String getName(){
        return EmployeeName;
    }
    public void setName(String name){
        this.EmployeeName = name;
    }
    public String getdept(){
        return EmployeeDepart;
    }
    public void setdept(String dept){
        this.EmployeeDepart = dept;
    }}
