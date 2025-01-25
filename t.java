public class t {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 1, 4, 2, 6 };
        int n = arr.length;
        
        int[] newARR = new int[n];
        int  max = newARR[0];
        // int min = newARR[0];

        for (int i = 0; i < n; i++) {
            // adding each group of numbers
            int sum =0;
            // System.out.println(sum);
            for (int j = 0; j < n; j++) {
                sum += arr[j] ;
            }
            sum -=arr[i];
            
            for (int j = 0; j <= i; j++) {
                    newARR[j] = sum;
               

            }
            
        }
       
        for(int i = 0;i < newARR.length;i++){
            System.out.println(newARR[i]);
            // if (newARR[i] > max) {
            //     max = arr[i];
            // }
            // if (newARR[i] < min) {
            //     min = arr[i];
            // }
        }
        System.out.println(max);
        
            // System.out.println(min);   

    }
}
