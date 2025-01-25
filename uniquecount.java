public class uniquecount {
    public static void main(String[] args) {
        int arr[]={2,2,2,3,4,4,4,23,23,27};
        int count =1;
        int uniquecount =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                if(count==1){
                uniquecount++;
            }
            count =1;
        }
        }
        if(count ==1){
           uniquecount++;
        }
        System.out.println(uniquecount);
    }
}
