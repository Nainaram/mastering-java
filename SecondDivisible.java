import java.util.Scanner;

public class SecondDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number of elements
        int[] arr = new int[n]; // Create an array to store the elements

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt(); // Read the value of k

        int countDivisible = 0; // Count of divisible numbers
        int secondDivisible = -1; // Store the second divisible number

        // Iterate through the array to find divisible numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % k == 0) { // Check if the element is divisible by k
                countDivisible++; 
                if (countDivisible == 2) { // Found the second divisible number
                    secondDivisible = arr[i];
                    break; // Exit the loop as we found the second divisible
                }
            }
        }

        // Print the second divisible number or -1 if not found
       if(secondDivisible !=-1){ System.out.println(secondDivisible);}
       else{System.out.print(-1);} 
    }
}