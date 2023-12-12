import java.io.*;
import java.util.*;
public class FilelistingDemo {
    public static void main(String[] args) {
        System.out.println("enter the file path");
        Scanner sc = new Scanner(System.in);
        String dirName = sc.nextLine();
        File dirFile = new File(dirName);
        if(!dirFile.isDirectory()){
            System.out.println(dirName + " is not a directory");
            return;
        }
        // for( String f : dirFile.list())
            // System.out.println(f);
// list(0) gives us only the directory names and size in milli seconds but 
//  listFiles() will allow us to show exact time and name of the file
            File []  files = dirFile.listFiles();
        Date fileDate = new Date();
        for(File a_File:files ){
            fileDate.setTime(a_File.lastModified());
                String content ;
            content = a_File.isDirectory()?"<Dir>": " " +a_File.length();
        System.out.println(fileDate + "\t"+ content + "\t" + a_File.getName());}

    }
    
}
