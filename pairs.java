import java.util.Scanner;

class pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondsmallest) {
                secondsmallest = arr[i];
            }

            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }

        if (secondsmallest == Integer.MAX_VALUE || secondlargest == Integer.MIN_VALUE) {
            System.out.println("Array must have at least two distinct elements.");
        } else {
            long minSum = (long) smallest + secondsmallest; // Sum of smallest pair
            long maxSum = (long) largest + secondlargest;   // Sum of largest pair

            // Calculating the average
            double average = (minSum + maxSum) / 2.0;

            System.out.printf("%.1f", average);
        }
    }
}
