
/**
 *
 * @author kan
 */
import java.util.Scanner;

public class MergeSort {

    public static void main(String args[]) {

        int totalNumbers = 0;
        System.out.println("Enter Length of Array : ");
        Scanner scanner = new Scanner(System.in);
        totalNumbers = scanner.nextInt();
        System.out.println("Enter " + totalNumbers + " Values : ");
        int array[] = new int[totalNumbers];

        for (int count = 0; count < totalNumbers; count++) {
            int input = scanner.nextInt();
            array[count] = input;
        }

        if (totalNumbers <= 1) {
            printArray(array);
        } else {
            sort(array, 0, array.length - 1);
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\n---Exit---");
    }

    private static void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(array, left, mid);
            sort(array, mid + 1, right);
            merge(array, left, mid, right);
        }

    }

    private static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid + 1;
        int fIndex = 0, lIndex = left, rIndex = mid + 1;

        int sortedArray[] = new int[lengthLeft + lengthRight];

        while (lIndex <= mid && rIndex <= right) {
            if (array[lIndex] < array[rIndex]) {
                sortedArray[fIndex] = array[lIndex];
                lIndex++;
                fIndex++;
            } else {
                sortedArray[fIndex] = array[rIndex];
                rIndex++;
                fIndex++;
            }
        }
        while (lIndex <= mid) {
            sortedArray[fIndex] = array[lIndex];
            lIndex++;
            fIndex++;
        }
        while (rIndex <= right) {
            sortedArray[fIndex] = array[rIndex];
            rIndex++;
            fIndex++;
        }

        for (int index = left, count = 0; index <= right; index++, count++) {
            array[index] = sortedArray[count];
        }
    }

}
