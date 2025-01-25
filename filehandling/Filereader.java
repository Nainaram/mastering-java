import java.io.File;
import java.io.FileReader;

public class Filereader {
    public static void main(String[] args) {
        File file =new File("C:\\codes\\FULLSTACK\\java\\filehandling\\Dem.txt");
        FileReader reader = null;
        char [] arr  = new char[20];
        try{
            reader = new FileReader(file);
                int c = reader.read();
                while(c!=-1){
                    System.out.print((char)c);
                     c = reader.read();
                }
        
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
