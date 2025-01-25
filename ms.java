import java.util.Scanner;

public class ms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Length of the first array
        int m = scanner.nextInt(); // Length of the second array
        int[] arr = new int[n];    // First array
        int[] arr2 = new int[m];   // Second array

        // Read elements into the first array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read elements into the second array
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Create an array to hold merged results
        int[] mergedArray = new int[n + m];

        // Variables to track the index of the three arrays
        int i = 0, j = 0, k = 0;

        // Merge the arrays by taking alternate elements from each array
        while (k < mergedArray.length) {
            if (i < arr.length) {     // Check if there are remaining elements in the first array
                mergedArray[k++] = arr[i]; // Add to merged array and increment index
                i += 2;              // Move to the next alternate element in the first array
            }
            if (j < arr2.length) {    // Check if there are remaining elements in the second array
                mergedArray[k++] = arr2[j]; // Add to merged array and increment index
                j += 2;              // Move to the next alternate element in the second array
            }
        }

        // Output the merged array
        for (int b = 0; b < mergedArray.length; b++) {
            System.out.print(mergedArray[b] + " ");
        }
        scanner.close();
    }
}
