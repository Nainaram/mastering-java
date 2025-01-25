import java.io.File;
import java.io.IOException;

public class FileHandle{
    public static void main(String[] args) {
       File file = new File("C:\\codes\\FULLSTACK\\java\\filehandling\\test1.txt");
        
    }
}











// System.out.println(file.exists());
// System.out.println(file.canRead());
// System.out.println(file.canWrite());
// System.out.println(file.length());
// System.out.println(file.getAbsolutePath());
// System.out.println(file.getName());
// System.out.println(file.getParent());
// System.out.println(file.isFile());
// System.out.println(file.isDirectory());
// System.out.println(file.isHidden());
// System.out.println(file.lastModified());
// System.out.println(file.delete());
// try {
    //   if(file.createNewFile()){
        //         System.out.println("File created successfully");
        //       }else{
            //             System.out.println("File already exists");
            //           }
            //      } catch (IOException e) {
                //               e.printStackTrace();
                //          }
                // String [] list = file.list();
                // for(String name : list){
                //     System.out.println(name);
                // }