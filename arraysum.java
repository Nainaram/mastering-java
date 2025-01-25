public class arraysum {
    public static int sumarr(int [] arr ,int index){
        
        if(index<0){
            return 0;
        }
        
            return arr[index]+sumarr(arr,index-1);
    }
    public static void main(String[] args) {
        int n [] ={12,32,43,54,65,45,33};
       
        // for(int i = 1;i<=n.length-1;i++){
        //     sum+=n[i];
        //  }
        System.out.println(sumarr(n,n.length-1));
    }
}
