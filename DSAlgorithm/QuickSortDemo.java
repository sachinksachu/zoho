import java.util.Arrays;

/**
 * Test class to sort array of integers using Quicksort algorithm in Java.
 * @author Javin Paul
 */
public class QuickSortDemo{

    public static void main(String args[]) {

        // unsorted integer array
        int[] unsorted = {6, 5, 3, 19, 8, 7, 2, 4};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));

        QuickSort algorithm = new QuickSort();

        // sorting integer array using quicksort algorithm
        algorithm.sort(unsorted);

        // printing sorted array
        System.out.println("Sorted array :" + Arrays.toString(unsorted));

    }

}

/**
 * Java Program sort numbers using QuickSort Algorithm. QuickSort is a divide
 * and conquer algorithm, which divides the original list, sort it and then
 * merge it to create sorted output.
 *
 * @author Javin Paul
 */
class QuickSort {

    private int input[];
    private int length;

    public void sort(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return;
        }
        this.input = numbers;
        length = numbers.length;
        quickSort(0, length - 1);
    }

    /*
     * This method implements in-place quicksort algorithm recursively.
     */
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        // pivot is middle index
        int pivot = input[low + (high - low) / 2];
        System.out.println("pivot : "+pivot);
        // Divide into two arrays
            System.out.println("i : "+i+" j:"+j);

        while (i <= j) {
            // System.out.println("i : "+i+" j:"+j);
            /**
             * As shown in above image, In each iteration, we will identify a
             * number from left side which is greater then the pivot value, and
             * a number from right side which is less then the pivot value. Once
             * search is complete, we can swap both numbers.
             */
            while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                // move index to next position on both sides
                i++;
                j--;
                
            }
            System.out.println("array"+Arrays.toString(input));
        }

        // calls quickSort() method recursively
        if (low < j) {
            System.out.println("calling"+low+":"+j);
            quickSort(low, j);
        }

        if (i < high) {
            System.out.println("calling"+i+":"+high);
            quickSort(i, high);
        }
    }

    private void swap(int i, int j) {
        System.out.println("swapping "+input[i]+" & "+input[j]);
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}