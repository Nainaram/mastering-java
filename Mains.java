import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for first array
        int size = scanner.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        
        // Input for second array
        int n = scanner.nextInt();
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }
        
        // Two-pointer technique
        int i = 0, j = 0;
        boolean found = false;
        
        // Assuming both arrays are sorted
        while (i < size && j < n) {
            if (A[i] == B[j]) {
                if (A[i] % 2 != 0 && B[j] % 2 != 0) {
                    System.out.print(A[i] + " ");
                    found = true;
                }
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        if (!found) {
            System.out.println("No common odd elements found.");
        }
    }
}
