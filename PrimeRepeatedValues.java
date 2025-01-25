import java.util.HashSet;

public class PrimeRepeatedValues {

    public static void main(String[] args) {
        // Example array
        int[] arr = {2, 3, 5, 2, 7, 11, 13, 3, 5, 5, 19, 23, 2};

        // HashSet to track primes we have seen
        HashSet<Integer> primesSeen = new HashSet<>();
        
        // HashSet to track primes that are repeated
        HashSet<Integer> repeatedPrimes = new HashSet<>();

        for (int num : arr) {
            // Check if the number is prime
            if (isPrime(num)) {
                // If it has been seen before, add to repeatedPrimes
                if (!primesSeen.add(num)) {
                    repeatedPrimes.add(num); // Adding a prime that is repeated
                }
            }
        }

        // Printing repeated primes
        if (repeatedPrimes.isEmpty()) {
            System.out.println("No repeated prime numbers found.");
        } else {
            for(int n :repeatedPrimes){
                System.out.println(n);
            }
           // System.out.println("Repeated prime numbers: " + repeatedPrimes);
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 1 and negative numbers are not prime
        if (num == 2 || num == 3) return true;  // 2 and 3 are prime
        if (num % 2 == 0 || num % 3 == 0) return false;  // Exclude multiples of 2 and 3
        
        // Check divisors from 5 to sqrt(num)
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
