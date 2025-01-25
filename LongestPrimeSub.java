import java.util.Scanner;

public class LongestPrimeSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
            int n  = scanner.nextInt();
            int  arr [] = new int [n];
            for(int i = 0;i<arr.length;i++){
                arr[i]=scanner.nextInt();
            }   
        
            longestSubArr(arr);
        }
    public static boolean isprime(int n){
                if(n<=1){
                    return false;
                }
                for(int i=2;i*i<=n;i++){
                    if(n%i==0){
                        return false;
                    }
                }
                return true;
             
    }
    public static void longestSubArr(int[] arr){
            int maxLength =0;
            int startIndex =0;
            int currentIndex =0;
            int currentLength =0;
            mam
            for(int i=0;i<arr.length;i++){
                    if(isprime(arr[i])){
                        if(currentLength ==0){
                            currentIndex =i;
                        }
                        currentLength++;
                        if(currentLength > maxLength){
                            maxLength =currentLength;
                            startIndex = currentIndex;
                        }

                    }
                    else {
                        currentLength =0;
                    }
            }
            if(maxLength>0){
                for(int i =startIndex ;i<maxLength+startIndex;i++){
                    System.out.print(arr[i]+" ");
                }
                
            }
            else {
                System.out.println("None");
            }
    }
}
