import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Deserializationss {
    public static void main(String[] args)  throws IOException,ClassNotFoundException{
        
        Emp emp = null;
        try{
            FileInputStream filein = new FileInputStream("result.txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            emp = (Emp) in.readObject();
            in.close();
            filein.close();
        
        }
        finally{
            System.out.println("Deserializing employee...");
            System.out.println("first name of the employee:"+ emp.name);
            System.out.println("address of the employee.. "+ emp.address);
        }
    }
}
