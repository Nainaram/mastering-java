import java.util.Scanner;

public class Malarin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        int largestRepeating = Integer.MIN_VALUE;  // Initialize to the smallest possible value
        boolean found = false;

        // Reading array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Array to keep track of printed elements
        boolean[] printed = new boolean[N];

        // Finding the largest repeating element
        for (int i = 0; i < arr.length; i++) {
            if (!printed[i]) {  // Skip if already printed
                boolean isRepeating = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        isRepeating = true;
                        printed[j] = true;  // Mark as printed
                    }
                }
                if (isRepeating) {
                    found = true;
                    if (arr[i] > largestRepeating) {
                        largestRepeating = arr[i];
                    }
                }
            }
        }

        // Print the largest repeating element
        if (found) {
            System.out.print(largestRepeating);
        } else {
            System.out.print(-1);  // No repeating element found
        }
    }
}
