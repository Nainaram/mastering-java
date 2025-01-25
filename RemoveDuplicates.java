public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr [] = {0,0,1,1,2,3,5};
        int Unicount = removeDups(arr);
        for(int i = 0;i<Unicount;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDups(int [] arr){
        if(arr.length == 0)// it will check if the array is empty , if yes then it will return 0
            return 0;
        int k = 1; // this is the count which compare the next element with it and  if it
        for(int i = 1; i<arr.length;i++){
            if(arr[i] != arr[k-1]){
                arr[k] = arr[i];
                k+=1;
            }
        }
        return k;
    }
}
