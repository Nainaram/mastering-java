// class which represents the controller
public class EmployeeController {
    // Declaring the variables  model and view
    private Employee model;
    private EmployeeView view;
    // Constructor  to intialize 
    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    // getter and setter methods 
    public void setEmployeeName(String name){
        model.setName(name);
    }
    public String getEmployeeName(){
        return model.getName();
    }
    public void setEmployeeId( String id){
        model.setID(id);
    }
    public String getEmployeeId(){
        return model.getID();
        }
    public void setEmployeeDept(String dept){
        model.setdept(dept);
    }
    public String getEmployeeDept(){
        return model.getdept();
    }
    // method to update view
     public void Updateview(){
        view.printEmployeeDetails(model.getName(), model.getID(), model.getdept());
     }}
