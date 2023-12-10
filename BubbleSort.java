import java.io.*;
public class BubbleSort{
    static void BubbleSort( int arr[] , int n){
        int temp,i,j;
        boolean swaped;
        for(i = 0; i < n ; i++){
            swaped =false;
            for( j = 0; j< n-i-1; j++){
                if(arr[j] < arr[j+1]){
                temp = arr[j] ;
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swaped = true;
            }

        }
        if(swaped == false){
            break;
        }
    }
}
     static void PrintArray( int arr[] , int n){
            int i ;
            for(i = 0; i < n ;i++){
            System.out.print(arr[i] + " ");
            }

}
        public static void main(String[] args) {
            int array[] = { 45,33,21,12,67,87,56,89,0,9};
            int size = array.length;
            BubbleSort(array , size);
            System.out.print("Sorted array:\n");
            PrintArray(array, size);
        }
}