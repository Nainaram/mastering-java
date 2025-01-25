public class largestElement {
    // this is the code that gives the largest element in the array.
    public static void main(String[] args) {
        int arr [] = { 23,54,34,23,56,67,87,90};
        int n = arr.length;
        int largest  = largestElementArray(arr,n);
        System.out.println(largest);
    }
    static int largestElementArray(int [] arrs , int max){
            max = arrs[0];
            for(int i = 1; i< arrs.length;i++){
                if(arrs[i] > max){
                    max= arrs[i];
                }
            }        return max;
    }
}
