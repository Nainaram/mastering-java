import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
    private String name;
    private long crn;
    private float balance;
    public Customer(String name, long crn, float balance) {
        this.name = name;
        this.crn = crn;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getCrn() {
        return crn;
    }
    public void setCrn(long crn) {
        this.crn = crn;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    
}
public class main {
    public static void main(String[] args) {
            Customer cm = new Customer("ALEX", 45, 1000001);
            String path = "C:\\codes\\FULLSTACK\\java\\filehandling\\Demo.txt";
            try{
                FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cm);
            oos.flush();
            }catch(Exception e ){
                e.printStackTrace();
            }
    }
}
