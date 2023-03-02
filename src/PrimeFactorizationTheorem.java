import java.util.Scanner;
import java.util.ArrayList;
public class PrimeFactorizationTheorem {
    public static void main(String[] args) {
        calculatePrimeFactors(getAnInteger());
    }

    static int getAnInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        return scanner.nextInt();
    }

    static void calculatePrimeFactors(int intNumber) {
        ArrayList<Integer> primeFactors=new ArrayList<>();

        int factor = 2;
        while (intNumber > 1) {

            if (intNumber % factor == 0) {
                primeFactors.add(factor);  // instead of System.out.print(factor + " ");
                intNumber /= factor;
            } else {
                factor++;
            }
        }
        System.out.println(primeFactors);
    }

}
