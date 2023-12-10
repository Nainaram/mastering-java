import java.io.*;
import java.util.*;

public class Twosum{
    static boolean twosom( int arr[] , int size, int x){
        for(int i = 0 ; i < size-1;i++){
            for(int j = (i+1);j<size; j++){
                if(arr[i] +arr[j]== x){
                    
                    System.out.println("the index of the numbers found to be are:" + arr[i] +" , "+arr[j] + " == " + x);
                    return true; 
                }            }
        }return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.println(" checkpair34");
        int arry [] = { 1,7,56,6,5,4,3};
        System.out.println(" enter the value to be checked");
       
        int size = arry.length;
        int x = sc.nextInt(); 
        if(twosom (arry,size,x)){
            System.out.println("yes");
            
        } 
        else{
            System.out.println("no");
        }
    }
}