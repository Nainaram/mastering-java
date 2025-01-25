import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        File file1  = new File("C:\\codes\\FULLSTACK\\java\\filehandling\\Dem.txt");
        File file2= new File("C:\\codes\\FULLSTACK\\java\\filehandling\\Demo.txt");
        FileReader reader = null;
        FileWriter writer = null;
        try{
            reader = new FileReader(file1);
            writer = new FileWriter(file2);
            int   c = reader.read();
            while(c!=-1){
                writer.write(c);
                c =reader.read();
            }
            writer.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException E){
            E.printStackTrace();
        }
    }
}
