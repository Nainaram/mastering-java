import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;

public class Beta {
    public static void main(String[] args) {

            String path ="C:\\codes\\FULLSTACK\\java\\filehandling\\test1.txt";
            String path1 = "C:\\codes\\FULLSTACK\\java\\filehandling\\test11.txt";
            FileReader reader = null;
            FileWriter writer = null;
            
            try {
                reader = new FileReader(path);
                writer = new FileWriter(path1);
                int i = 0;
                while((i = reader.read()) != -1){
                    writer.write(i);
                }
                writer.flush();
                System.out.println("File copied successfully");
                // reader.read(arr);
                // for(char c : arr){
                //     System.out.print(c);
                // }

            } catch (Exception e) {
                e.printStackTrace();
    }
}
}
