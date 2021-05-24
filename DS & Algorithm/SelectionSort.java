public class SelectionSort {

    public void sortArray(int[] arr){
        int j,i;
        for(i=0; i<arr.length; i++){
            int minIndex = i;
            System.out.println("len:"+(arr.length));
            for(j=i;j<arr.length;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            if(arr[minIndex]!=arr[i]){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i]=temp;
            }
        }
    }

    void displayArray(int arr[])
    {
        for(int i:arr)
            System.out.print(i+ " ");
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int arr[] = {64, 34, 25, 12, 22, 11,90,89};
        obj.sortArray(arr);
        obj.displayArray(arr);
    }
}
