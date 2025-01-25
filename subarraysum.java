public class subarraysum {
    public static void main(String[] args) {
        int arr[] ={ -1,-2,-3,-4};
        boolean found = false;
        for(int len = 1;len<arr.length;len++){
            for(int i =0;i<=arr.length-len;i++){
                int sum =0;
                for(int j =i;j<i+len;j++){
                sum+=arr[j];
                }
                if(isprime(sum)){
                    for(int j =i;j<i+len;j++){
                System.out.print(arr[j]+" ");
                found =true;
                }
                System.out.println();
            }
        }
        }
        if(!found){System.out.println("None");}
    }
    public static boolean isprime(int n){
        if(n<=1){return false;}
        if(n==2){return true;}
        if(n%2==0){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
