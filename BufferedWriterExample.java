import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            String content = "Hello, World!";
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
