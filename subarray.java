public class subarray {
    public static void main(String[] args) {
        int arr [] ={ 5,1,2,4,9,3,1,3,3};
        int k =3;
        for(int i=0;i<=arr.length-k;i++){
            for(int j =i;j<k+i;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        }
    }
