import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedreader {
    public static void main(String[] args) {
        // File file1  = new File();
        File file2= new File("C:\\codes\\FULLSTACK\\java\\filehandling\\Demo.txt");
        FileReader reader = null;
        BufferedReader bfr = null;
        // FileWriter writer = null;
        try{
            reader = new FileReader(file2);
            bfr = new BufferedReader(reader);
            String line = bfr.readLine();
            int count =0;
            while(line!=null){
                count++;
                line =bfr.readLine();
                System.out.println(line);
            }
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException E){
            E.printStackTrace();
        }
    }
}
