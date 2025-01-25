public class COUNTOCCURENC {
    public static void main(String[] args) {
        int arr [] ={ 1,2,3,4,4,5,5,6,7,7};
        
            int count =1;
            for(int j =0;j<arr.length-1;j++){
                
                if(arr[j]==arr[j+1]){
                    count++;;
                }
                else {
                    System.out.println(arr[j]+ " "+ count );
                    count =1;
                }
            }
            System.out.println(arr[arr.length-1]+" "+count);
        
    }
}
