public class largestrepeating {
            public static void main(String[] args) {
                int arr [] ={ 1,2,3,4,4,5,5,5,6,6,6,6,6};
                int largest = Integer.MIN_VALUE;
                for(int i =1;i<arr.length-1;i++){
                    if(arr[i]==arr[i-1]){
                        largest = arr[i];
                    }
                }
                System.out.print(largest);
            }
}
