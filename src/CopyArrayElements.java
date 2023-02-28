import java.util.Scanner;

public class CopyArrayElements {

    public static void main(String[] args) {
        printArray(copyOfArrayElements(initializeArray()));
    }

    static int[] initializeArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");

        int sizeOfArray = scanner.nextInt();
        int[] intArray = new int[sizeOfArray];

        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Enter the element of [" + i + "] : ");
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    static boolean isInclude(int[] copyOfIntArray, int copiedValue) {

        for (int i : copyOfIntArray) {
            if (i == copiedValue) {
                return true;
            }
        }
        return false;
    }

    static int[] copyOfArrayElements(int[] intArray) {

        int[] copyOfIntArray = new int[intArray.length];
        int indexOfCopyOfIntArray = 0;

        for (int value : intArray) {
            if (!isInclude(copyOfIntArray, value)) {
                copyOfIntArray[indexOfCopyOfIntArray++] = value;
            }
        }
        return copyOfIntArray;
    }

    static void printArray(int[] intArray) {

        System.out.print("The New Array: ");

        for (int i : intArray) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }

}
