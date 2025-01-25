public  class consecutive{
    public static void main(String[] args) {
        int arr [] ={ 5,12,13,14,9,2,3,4,5,8};
        int count =1,max =0,si =0,ei =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                // System.out.print(arr[i]+" ");
                count++;
            }
            else{
                // System.out.print(arr[i]+" ");
                // System.out.println(count);
                if(count>max){
                    max=count;
                    ei = i;
                }
                count=1;
                // System.out.println();
            }
             
        }
        if(count>max){
            max=count;
            ei = arr.length-1;
        }
        si = ei -max+1;
        for(int  i =si;i<=ei;i++){

            System.out.println(arr[i]);
        }
    }
}