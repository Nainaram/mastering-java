import java.io.*;
import java.util.*;
 class FileExt implements FilenameFilter{
    String ext;
    public FileExt(String string) {
    }
    public void FilterExt(String ext){
        this.ext = ext;
    }
    public boolean accept(File dir, String name ){
        return name.endsWith("ext");
    }
}
public class FileListingDemo_2{
    public static  void main(String[] args) {
        FilenameFilter only = new FileExt("java");
        Scanner sc = new Scanner(System.in);
        String dirName = sc.nextLine();
       //try{ String dirName =   args[0];
       
        File mydir = new File(dirName);
        if(mydir.isDirectory()){
            File[]  files = mydir.listFiles(only);
            for(File a_File: files){
                System.out.println(a_File.getName());
        System.out.println("Total:" + files.length) ;
        }
        }
        else
            System.out.println("Not a directory");
        }//catch(Exception e){
           // System.out.println(" its a error");
        //}

        
    }

