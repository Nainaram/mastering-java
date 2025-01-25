public class LongestSubarrayWithSumK {
    public static void longestSubarrayWithSumK(int[] arr, int k) {
        int maxLen = 0;
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
                    if (currentLen > maxLen) {
                        maxLen = currentLen;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        // Print the length and the longest subarray
        if (maxLen > 0) {
            System.out.println("Length of the longest subarray with sum " + k + ": " + maxLen);
            System.out.print("Longest subarray: ");
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
        longestSubarrayWithSumK(arr, k);
    }
}
