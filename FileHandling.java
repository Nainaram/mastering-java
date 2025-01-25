import java.io.File;
import java.io.IOException;
public class FileHandling{
    public static void main(String[] args) {
        File file = new File("Example.txt");
        // check if the file exists
        if(file.exists()){
            System.out.println("File Exists!");
        }
        else{
            System.out.println("File Doesn't Exists");
        }
        // create a file 
        try{
            if(file.createNewFile()){
                System.out.println("File created Successfully." +file.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
}
        // delete the  file
        // if(file.delete()){
        //     System.out.println("File Deleted successfully " + file.getName());
        // }
        // else{
        //     System.out.println("Failed to delete the file .");
        // }
    }

}