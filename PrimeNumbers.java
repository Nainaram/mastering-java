import java.util.Scanner;
class PrimeNumbers{
	public static void main(String[] args) {
			System.out.println("***** PRIME NUMBERS *****");
			Scanner objScanner = new Scanner(System.in);
			System.out.print("\nEnter n Value:");
			long n = objScanner.nextInt();
			for (long i = 2; i <= n; i++)
			{
				boolean isprime = isNumPrime(i);
				if (isprime)
				{
					System.out.print(i + " ");
				}
			}
		}
	public static boolean isNumPrime(long number)
	{
		boolean result = true;
		for (long i = 2; i <= number / 2; i++)
		{
			if ((number % i) != 0)
			{
				result = true;
			}
			else
			{
				result = false;
				break;
			}
		}
		return result;
	}
}