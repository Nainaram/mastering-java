import java.util.PriorityQueue;

public class findKthlargestelement {
    // this is the code that finds the kth largest element in the arrays using the heap and PrirityQueue 
    public static void main(String[] args) {
        int [] arr = { 23,34,54,6576,87,56,12};
        int k = 1CE;
        int klargest = findKthlargestele(arr,k);
        System.out.println(klargest);
    }
    static int findKthlargestele(int [] nums,int k ){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
            for( int i = 1;i<nums.length;i++){
                minHeap.offer(nums[i]);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
            }
        return minHeap.peek();
    }
}
