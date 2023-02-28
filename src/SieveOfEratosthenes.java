import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a limit number as a positive integer : ");
        int limitNumber = scanner.nextInt();

        countNumberOfPrimesUpTo(checkNumberOfPrimesUpTo(limitNumber));
    }

    static boolean[] checkNumberOfPrimesUpTo(int number) {

        boolean[] isPrime = new boolean[number + 1];
        for (int i = 0; i <= number; i++) {
            isPrime[i] = true;
        }

        for (int j = 2; j * j <= number; j++) {
            if (isPrime[j]) {
                for (int k = j * j; k <= number; k += j) {
                    isPrime[k] = false;
                }
            }
        }
        return isPrime;
    }

    static void countNumberOfPrimesUpTo(boolean[] primeArray) {

        int counter = 0;
        for (boolean b : primeArray) {
            if (b) {
                counter++;
            }
        }
        System.out.print("Total number of prime numbers up to the limit number: " + (counter - 2));
    }
}
