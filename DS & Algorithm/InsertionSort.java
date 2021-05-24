public class InsertionSort {

    public void sortArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int j=i;
            while(j > 0 && arr[j-1]> arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j=j-1;
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int arr[] = {64, 34, 25, 12, 25, 11, 90};
        obj.sortArray(arr);
        obj.printArray(arr);
    }
}
//best case 0(n)
//worst case //o(n2)

//source https://www.youtube.com/watch?v=JU767SDMDvA