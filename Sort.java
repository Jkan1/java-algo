
/**
 *
 * @author kan
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        int array[] = {7, 8, 5, 6, 4, 99, 3, 86, 87, 83, 22, 21, 20, 56, 2, 7, 8, 9, 0, 9, 9, 77};

//        array = new InsertionSort(array).sort();
//        array = new BubbleSort(array).sort();        
//        array = new SelectionSort(array).sort()
        array = new MergeSort(array).sort();

        printArray(array);
    }

    static void printArray(int array[]) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

}

class InsertionSort {

    int array[];

    InsertionSort(int array[]) {
        this.array = array;
    }

    public int[] sort() {

        int innerIndex;
        for (int index = 1; index < this.array.length; index++) {
            innerIndex = index;
            while (innerIndex > 0 && this.array[innerIndex] < this.array[innerIndex - 1]) {
                int temp = this.array[innerIndex];
                this.array[innerIndex] = this.array[innerIndex - 1];
                this.array[innerIndex - 1] = temp;
                innerIndex -= 1;
            }
        }
        return this.array;
    }

}

class BubbleSort {

    int array[];

    BubbleSort(int array[]) {
        this.array = array;
    }

    public int[] sort() {

        for (int index = 1; index < this.array.length; index++) {

            for (int innerIndex = 0; innerIndex < this.array.length - index; innerIndex++) {
                if (this.array[innerIndex] > this.array[innerIndex + 1]) {
                    int temp = this.array[innerIndex];
                    this.array[innerIndex] = this.array[innerIndex + 1];
                    this.array[innerIndex + 1] = temp;
                }
            }
        }
        return this.array;
    }

}

class SelectionSort {

    int array[];

    SelectionSort(int array[]) {
        this.array = array;
    }

    public int[] sort() {

        for (int index = 0; index < this.array.length - 1; index++) {

            int optimalValueIndex = index;
            for (int innerIndex = index + 1; innerIndex < this.array.length; innerIndex++) {
                if (this.array[innerIndex] < this.array[optimalValueIndex]) {
                    optimalValueIndex = innerIndex;
                }
            }
            int temp = this.array[optimalValueIndex];
            this.array[optimalValueIndex] = this.array[index];
            this.array[index] = temp;
        }
        return this.array;
    }

}

class MergeSort {

    int array[];

    MergeSort(int array[]) {
        this.array = array;
    }

    public int[] sort() {

        mergeSort(this.array, 0, this.array.length - 1);

        return this.array;
    }

    public void mergeSort(int array[], int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(array, left, mid);

            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);

        }
    }

    public void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for (int index = 0; index < n1; index++) {
            leftArray[index] = array[left + index];
        }
        for (int index = 0; index < n2; index++) {
            rightArray[index] = array[mid + 1 + index];
        }

        int indexLeft = 0, indexRight = 0;
        int k = left;
        while (indexLeft < n1 && indexRight < n2) {
            if (leftArray[indexLeft] <= rightArray[indexRight]) {
                array[k] = leftArray[indexLeft];
                indexLeft++;
            } else {
                array[k] = rightArray[indexRight];
                indexRight++;
            }
            k++;
        }

        while (indexLeft < n1) {
            array[k] = leftArray[indexLeft];
            indexLeft++;
            k++;
        }

        while (indexRight < n2) {
            array[k] = rightArray[indexRight];
            indexRight++;
            k++;
        }

    }

}
