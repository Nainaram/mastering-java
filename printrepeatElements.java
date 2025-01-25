public class printrepeatElements {
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,5,6,6,7,7};
        int arr2 []={7,7,6,6,5,5,4,3,2,1};
        int i =0,j =arr2.length-1;
        while(i<arr.length&&j>=0){
            if(arr[i]==arr2[j]){
                System.out.print(arr[i]+" ");
                i++;
                j--;
            }
            else if( arr[i]>arr2[j]){
                    j--;
            }
            else{
                i++;
            }
        }
    }
}
