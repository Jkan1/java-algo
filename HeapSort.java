
/**
 *
 * @author kan
 */
import java.util.Scanner;

public class HeapSort {

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
            sort(array);
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\n---Exit---");
    }

    private static void sort(int array[]) {

        int n = array.length;

        for (int index = n / 2 - 1; index >= 0; index--) {
            heapify(array, n, index);
        }

        for (int index = n - 1; index > 0; index--) {

            int temp = array[0];
            array[0] = array[index];
            array[index] = temp;

            heapify(array, index, 0);
        }
    }

    private static void heapify(int[] array, int n, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }
}
