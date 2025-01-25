import java.util.Scanner;

class uniq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && i < arr.length - 1 && isPrime(arr[i]) && arr[i] == arr[i - 1] && arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) System.out.println("None");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
