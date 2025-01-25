public class rearrange2 {
    public static void main(String[] args) {
        int arr [] ={5,-1,3,-1,4,5,3,-1,8,2};
        int i =0;
        while(i<arr.length){
            if(arr[i]==-1){
                System.out.print(arr[i]+" ");
            }
            i++;
        }
        int j =0;
        while(j<arr.length){
            if(arr[j]!=-1){
                System.out.print(arr[j]+" ");
            }
            j++;
        }
    }
}
