public class commonelement {
    public static void main(String[] args) {
        int arr1 [] ={ 3,5,6,8,8,9};
        int arr2 [] ={2,3,4,6,7,8,8};
        int i=0,j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
}
