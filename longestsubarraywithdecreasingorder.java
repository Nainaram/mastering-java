import java.util.*;
public class longestsubarraywithdecreasingorder {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr  [] = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int currentlength = 1;
        int maxlength = 1;
        int endindex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                currentlength++;
            }
            else{
                if(currentlength>maxlength){
                    maxlength = currentlength;
                    endindex = i-1;
                }
                currentlength = 1;
            }
            
        }
            if(currentlength > maxlength){
                maxlength  = currentlength;
                endindex = arr.length-1;
            }
        List<Integer> longestsubarray = new ArrayList<>();
        for(int i=endindex-maxlength+1;i<=endindex;i++ ){
            longestsubarray.add(arr[icod]);
        }
        for(int i:longestsubarray){
            System.out.print(i+" ");
        }
    }
}
