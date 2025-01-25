import java.util.Scanner;

public class Subarrayfinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Size of the array
        int K = scanner.nextInt();  // Required difference
        int[] array = new int[N];

        // Reading the array elements
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        boolean found = false;

        // Checking all possible subarrays
        for (int start = 0; start < N; start++) {
            for (int end = start; end < N; end++) {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                // Determine the min and max of the current subarray
                for (int k = start; k <= end; k++) {
                    if (array[k] > max) {
                        max = array[k];
                    }
                    if (array[k] < min) {
                        min = array[k];
                    }
                }

                // Check if the difference is K
                if (max - min == K) {
                    found = true;
                    // Print the subarray
                    for (int k = start; k <= end; k++) {
                        System.out.print(array[k] + " ");
                    }
                    
                    System.out.println();
                    
                }
            }
        }

        // If no subarray found, print "None"
        if (!found) {
            System.out.println("None");
        }

        scanner.close();
    }
}
