public class SmallestSubarrayWithSumK {
    public static void smallestSubarrayWithSumK(int[] arr, int k) {
        int minLen = Integer.MAX_VALUE;
        int n = arr.length;
        int start = -1, end = -1;

        // Iterate over all subarrays
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                
                // Check if the sum of the current subarray equals 'k'
                if (currentSum == k) {
                    int currentLen = j - i + 1;
                    if (currentLen < minLen) {
                        minLen = currentLen;
                        start = i;
                        end = j;
                    }
                    // No need to check further as we're looking for the smallest subarray
                    break;
                }
            }
        }

        // Print the length and the smallest subarray
        if (minLen != Integer.MAX_VALUE) {
            System.out.println("Length of the smallest subarray with sum " + k + ": " + minLen);
            System.out.print("Smallest subarray: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No subarray with sum " + k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        smallestSubarrayWithSumK(arr, k);
    }
}
