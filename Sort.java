/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

        int array[] = {7, 8, 5, 6, 4, 99, 3, 86, 56, 2, 7, 8, 9, 0, 9, 9, 9, 9, 77};

        array = new InsertionSort(array).sort();

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
