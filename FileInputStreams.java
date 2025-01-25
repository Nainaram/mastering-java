import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreams{
    public static void main(String[] args) {
       
        try( FileInputStream fis = new FileInputStream("Example.txt");){
        int content;
        
        while ((content = fis.read()) != -1){
            //print the content in the characters
            System.out.print((char) content);

        }
    }catch(IOException e){
        e.printStackTrace();
    }
    }

}