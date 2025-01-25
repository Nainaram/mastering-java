import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class number {
        public static void main(String[] args) throws Exception{
            String path ="C:\\codes\\FULLSTACK\\java\\filehandling\\name.txt";
            String path1 = "C:\\codes\\FULLSTACK\\java\\filehandling\\phone.txt";
            String path3 = "C:\\codes\\FULLSTACK\\java\\filehandling\\total.txt";

            FileReader reader1 = null;
            FileReader reader2 = null;
            FileWriter writer = null;

            BufferedReader breader1 = null;
            BufferedReader breader2 = null;
            BufferedWriter bwriter = null;
            try{
                reader1 = new FileReader(path);
                reader2 = new FileReader(path1);
                breader1 = new BufferedReader(reader1);
                breader2 = new BufferedReader(reader2);
                writer = new FileWriter(path3);
                bwriter = new BufferedWriter(writer);
                String name = breader1.readLine();
                String phone = breader2.readLine();
                while( name != null|| phone != null){
                            System.out.println(name + " " + phone);
                          name =  breader1.readLine();
                            phone =  breader2.readLine();
                            bwriter.write(name + " " + phone+"\n");
                }
                bwriter.flush();
                bwriter.close();
                breader1.close();
                breader2.close();
                reader1.close();
                reader2.close();
                writer.close();
                System.out.println("Data copied successfully");
               
            }catch(Exception e){
                e.printStackTrace();
                }
}
}
