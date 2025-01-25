import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\codes\\FULLSTACK\\java\\filehandling\\Dem.txt");
            FileWriter writer = new FileWriter(file,true);
            writer.write("alluarjun\n");
            writer.write("pushpa\n");
            writer.write("pushpa2\n");
            writer.write("srileela\n");
            
            writer.flush();

                    
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
