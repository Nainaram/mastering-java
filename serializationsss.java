import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializationsss {
    public static void main(String[] args) {
        Emp e  = new Emp();
        e .name = "monica mittal";
        e.address = "bangalore";
        e.age =343;
        try{
            FileOutputStream fos = new FileOutputStream("result.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(e);
            out.close();
            fos.close();
            System.out.println("Serialized data saved in the result.txt");
            
        }
        catch(IOException es){
            es.printStackTrace();
        }
    }
}
