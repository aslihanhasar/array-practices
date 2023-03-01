import java.util.Scanner;

public class DivisorsOfAnInteger {

    public static void main(String[] args) {
        printArray(findDivisorsOfAnInteger(getAnInteger()));
    }

    static int getAnInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        return scanner.nextInt();
    }

    static int[] findDivisorsOfAnInteger(int intNumber) {

        int[] divisorArray = new int[intNumber];
        int indexOfDivisorArray = 0;

        for (int i = 1; i <= intNumber; i++) {
            if (intNumber % i == 0) {
                divisorArray[indexOfDivisorArray++] = i;
            }
        }
        return divisorArray;
    }

    static void printArray(int[] intArray) {
        System.out.print("Divisors of this integer: ");
        for (int i : intArray) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }

}
