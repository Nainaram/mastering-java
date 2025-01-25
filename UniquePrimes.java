public class UniquePrimes {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 5, 7, 2, 3, 5};  // Example array

        // Sort the array to easily check for duplicates
        java.util.Arrays.sort(arr);

        // Print unique prime elements
        printUniquePrimes(arr);
    }

    // Method to print unique prime elements
    public static void printUniquePrimes(int[] arr) {
        int prevPrime = -1;  // Use a value that will not be in the array to track duplicates

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1 && isPrime(arr[i]) && arr[i] != prevPrime) {
                // If the current element is a prime number and not a duplicate, print it
                System.out.println(arr[i]);
                prevPrime = arr[i];  // Update previous prime
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
