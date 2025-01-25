public class oddrepe{
    public static void main(String[] args) {
        int arr [] ={ 3,1,3,5,7,5,6,7};
        boolean isprinted[] =new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0&&!isprinted[i]){
                boolean isrepeated = false;
                    for(int j =i+1;j<arr.length;j++){
                        
                        if(arr[i]==arr[j]){
                            isrepeated =true;
                            isprinted[j]=true;
                            
                        }
                    }
                    if(isrepeated){
                        System.out.println(arr[i]+" ");
                        isprinted[i]=true;
                        
                    }
            }
        }
    }
}