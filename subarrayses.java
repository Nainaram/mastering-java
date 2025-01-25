public class subarrayses {
    public static void main(String[] args) {
        int arr [] ={1,6,5,3,0,2,1,0,1,0,2,4,1};
        int n  = arr.length;
        int k =6;
        boolean isfound = false;
        // int maxlen =Integer.MAX_VALUE;
        for(int len = 1;len<=arr.length;len++)
        {
            for(int i=0;i<arr.length-len;i++)
            {
                int sum =0;
                for(int j =i;j<i+len;j++)
                {
                    sum+=arr[j];
                }
               
               
                if(sum==k)
                {
                    for(int j =i;j<i+len;j++)
                    {
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();
                    isfound =true;
                    
                }
            }
            if(isfound){
            break;}
            
            
        }
    }
}
