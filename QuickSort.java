
/**
 *
 * @author kan
 */
import java.util.Scanner;

public class QuickSort {

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
        scanner.close();
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\n---Exit---");
    }

    private static void sort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            sort(array, left, pivot - 1);
            sort(array, pivot + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = right;
        int count = -1;

        for (int index = left; index < right; index++) {
            if (array[index] <= array[pivot]) {
                count++;
                int temp = array[index];
                array[index] = array[left + count];
                array[left + count] = temp;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[left + count + 1];
        array[left + count + 1] = temp;

        return (left + count + 1);
    }
}
