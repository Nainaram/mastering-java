import java.io.*;
public class myArray{
    public static void main(String[] args){
        int [][] a = {
            {1,3,3},
            {1,2,3},
            {2,3,4},
            {2,3,4}
        };
        for(int i = 0; i<4; i++){
            for (int j=0; j< 3;j++){
                System.out.print(a[i][j] );
                System.out.print(" ");
                //System.out.println("succesfully excuted");
            }
            System.out.println("\n");
        }
    }
}
