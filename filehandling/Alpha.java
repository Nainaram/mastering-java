import java.io.FileWriter;
import java.util.Scanner;

public class Alpha {
    public static void main(String[] args) {
        
            String path ="C:\\codes\\FULLSTACK\\java\\filehandling\\test1.txt";
            FileWriter writer = null;
            Scanner scanner  = new Scanner(System.in);
            try {
                System.out.println("Enter the text to write in the file");
                String text = scanner.nextLine();
                writer = new FileWriter(path,true);
                writer.write(text);
                writer.flush();
                System.out.println("File written successfully");
            } catch (Exception e) {
                e.printStackTrace();
    }
    finally{
        try {
            writer.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}
