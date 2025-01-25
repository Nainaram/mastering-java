import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaders {
    public static void main(String[] args) {
        try(
            BufferedReader bf = new BufferedReader( new FileReader("Example.txt"));){
            String line;
            while((line =bf.readLine()) != null){
                System.out.print(line);
            }
        }
        catch( IOException e){
            e.printStackTrace();
        }
    }

    
}
