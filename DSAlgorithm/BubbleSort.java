public class BubbleSort {
    
    public void sortArray(int[] arr){
        
        for(int i=0; i<arr.length-1;i++){
            // System.out.println("-----------------------"+i);
            for(int j=1; j<arr.length-i; j++){
                // System.out.println(arr[j]+"-->"+arr[j+1]+":"+j);
                if(arr[j-1] < arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
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
        BubbleSort obj = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        obj.sortArray(arr);
        obj.printArray(arr);
    }
}
//best case 0(n)
//worst case //o(n2)