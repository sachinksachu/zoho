import java.util.Arrays;

class QuickSort {

  // divide the array on the basis of pivot
  int partition(int array[], int low, int high) {

    // select last element as pivot
    int pivot = array[high];

    // initialize the second pointer
    int i = (low - 1);
    System.out.println("i:"+i);
    // Put the elements smaller than pivot on the left and
    // greater than pivot on the right of pivot
    for (int j = low; j < high; j++) {

      // compare all elements with pivot
      // swap the element greater than pivot
      // with element smaller than pivot
      // to sort in descending order
      // if (array[j] >= pivot)
      if (array[j] <= pivot) {

        // increase the second pointer if
        // smaller element is swapped with greater
        i++;
        System.out.println("a["+i+"]"+array[i]+"\ta["+j+"]"+array[j]);
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    // put pivot in position
    // so that element on left are smaller
    // element on right are greater than pivot
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return (i + 1);
  }

  void quickSort(int array[], int low, int high, int xx) {
    if (low < high) {
        System.out.println("xx"+xx);
      // Select pivot position and put all the elements smaller
      // than pivot on the left and greater than pivot on right
      int pi = partition(array, low, high);

      // sort the elements on the left of the pivot
      quickSort(array, low, pi - 1,1);
      System.out.println("---------------------------------------");
      // sort the elements on the right of pivot
      quickSort(array, pi + 1, high,2);
    }
  }

  // Driver code
  public static void main(String args[]) {

    // create an unsorted array
    int[] data = { 81, 7, 2, 1, 0, 9, 6 ,3,45,2,1,67,8,90,8,66};
    int size = data.length;

    // create an object of the Main class
    QuickSort qs = new QuickSort();

    // pass the array with the first and last index
    qs.quickSort(data, 0, size - 1,0);
    System.out.println("Sorted Array: ");
    System.out.println(Arrays.toString(data));
  }
}