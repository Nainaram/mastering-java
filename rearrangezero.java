import java.util.*;
public class rearrangezero {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);  
         int n =scanner.nextInt();
         int arr[]=new int[n];
         for(int i =0;i<arr.length;i++)
         {
            arr[i]=scanner.nextInt();
                 }
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]!=0){
                arr[j++]=arr[i++];
            }
            else{
                i++;
            }
        }
        while(j<arr.length)
        {
            arr[j]=0;
            j++;
        }
        for(int k =0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
      }
}
