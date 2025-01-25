import java.util.*;
public class repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] =new int[n];
        int m =sc.nextInt();
        int arr2 [] =new int[m];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j =0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int i =0,j =0;
        while(i<n&&j<m){
            if(arr[i]==arr2[j]){
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
            else if(arr[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        sc.close();

    }
    
}
