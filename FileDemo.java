import java.io.*;
public class FileDemo{
    public static void main(String[] args) {
        File newFile = new File("C:\\java codes\\mastering-java\\FileDemo.java");
        System.out.println("Filename: " + newFile.getName());
        System.out.println("Filepath: " + newFile.getPath());
        System.out.println("FileParent: " + newFile.getParent());
        System.out.println("File is Executable: " + newFile.canExecute());
        System.out.println("File length: " + newFile.length());
        System.out.println("File modified time: " + newFile.lastModified() + "Millieseconds");
        System.out.println("create a new directory");
        File f = new File ("C:\\java codes\\mastering-java\\Checknewfile\\codes\\check");
            if(f.mkdirs())// first it uses the mkdir() for single directory creation and  to 
            // to create a multiple dir like folder in folder ,we can use ,mkdirs()
            System.out.println("created a file directory");
            else
            System.out.println("Sorry check the path");

    }
}