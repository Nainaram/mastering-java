import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class buffredwriter {
    public static void main(String[] args) {
        File file1  = new File("C:\\codes\\FULLSTACK\\java\\filehandling\\Dem.txt");
        // File file2= new File("C:\\codes\\FULLSTACK\\java\\filehandling\\Demo.txt");
        FileWriter reader = null;
        BufferedWriter bfr = null;
        // FileWriter writer = null;
        try{
            reader = new FileWriter(file1);
            bfr = new BufferedWriter(reader);
               bfr.write("india");
                bfr.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException E){
            E.printStackTrace();
        }
    }
}
