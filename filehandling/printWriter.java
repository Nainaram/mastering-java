import java.io.PrintWriter;
import java.util.Scanner;

public class printWriter {
    public static void main(String[] args) {
        String path ="C:\\codes\\FULLSTACK\\java\\filehandling\\Dem.txt";
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        try{
            PrintWriter writer = new PrintWriter(path);
                writer.print(name);
                writer.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
