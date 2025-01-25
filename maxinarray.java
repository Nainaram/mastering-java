public class maxinarray {
    public static int max(int arr [] ,int index){
        
        if(index==arr.length-1){
            return arr[index];
        }
        int restofarr = max(arr,index+1);
        return Math.max(arr[index],restofarr);

    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,5,6,6,6,7,76,56,45,100};
        int index =0;
        System.out.println(max(arr,index));
    }
}
