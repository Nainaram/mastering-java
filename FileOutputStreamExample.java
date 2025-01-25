import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamExample {
    public static void main(String[] args) {
       try(FileOutputStream fos  = new FileOutputStream("Example.txt");){
                String content = "Hello World!!";
                fos.write(content.getBytes());
    }
    catch(IOException e)
{
    e.printStackTrace();
}
}
    
}
