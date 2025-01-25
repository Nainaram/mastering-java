import java.util.Scanner;

public class mergeArrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            int arr1 [] =new int[n];
            for(int i=0;i<arr1.length;i++){
                arr1[i]=sc.nextInt();
            }
            int m = sc.nextInt();
            int arr2 [] =new int [m];
            for(int i=0;i<arr2.length;i++){
                arr2[i]=sc.nextInt();
            }
            int mergedArray [] = new int[n+m];
            
            int i =0,j=0,k=0;
            while(i<n&&j<m){
                if(arr1[i]<=arr2[j]){
                    mergedArray[k++]=arr1[i++];
                    
                }
                else {
                    mergedArray[k++]=arr2[j++];
                }
            }
            while(i<n){
                mergedArray[k++]=arr1[i++];
                
                
            }
            while(j<m){
                mergedArray[k++]=arr2[j++];
                
                
            }
            for(int res=0;res<mergedArray.length;res++){
            System.out.print(mergedArray[res]+" ");
            }
    }
}
