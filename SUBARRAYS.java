public class SUBARRAYS {
    public static void main(String[] args) {
        int arr [] ={ 1,2,3,4,5};
        boolean found =false;
        int k = 9;
        for(int len = 1;len<arr.length;len++){
            for(int i=0;i<=arr.length-len;i++){
                int sum =0;
                for(int j =i;j<i+len;j++){
                    sum+=arr[j];
                }
                if(sum==k){
                    int co = i;
                    while(co<i+len){
                        System.out.print(arr[co]+" ");
                        co++;
                    }
                    found =true;
                    System.out.println();
                }
            }
        }
        if(!found){System.out.println("None");}
    }
}
