
/**
 *
 * @author kan
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        int array[] = {7, 8, 5, 6, 4, 99, 3, 86, 87, 83, 22, 21, 20, 56, 2, 7, 8, 9, 0, 9, 9, 77};

//        array = new InsertionSort(array).sort();        
//        array = new BubbleSort(array).sort();        
        array = new SelectionSort(array).sort();

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

        int flag = 1;
        for (int index = flag; index < this.array.length; index++) {

            for (int innerIndex = index; innerIndex > 0; innerIndex--) {

                if (this.array[innerIndex] < this.array[innerIndex - 1]) {
                    int temp = this.array[innerIndex];
                    this.array[innerIndex] = this.array[innerIndex - 1];
                    this.array[innerIndex - 1] = temp;
                }
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
