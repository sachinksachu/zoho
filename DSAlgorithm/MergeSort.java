public class MergeSort {
    void merge(int arr[], int beg, int mid, int end) {
        
        //calculate size for left & right array
        int n1 = mid - beg + 1;
        int n2 = end - mid ;

        //create temp array
        int[] Left = new int[n1];
        int[] Right = new int[n2];

        //copy data to left & right array
        for(int i=0;i<n1;i++){
            Left[i]= arr[beg+i];
        }
        for(int j=0;j<n2;j++){
            Right[j]= arr[mid+1+j];
        }

        //sort & merge temp array
        //initialise index
        int i=0,j=0;
        int arrayIndex =beg;

        while(i<n1 && j<n2){
            if(Left[i] <= Right[j]){
                arr[arrayIndex] = Left[i];
                i++;
                
            }
            else{
                arr[arrayIndex] = Right[j];
                j++;
            
            }
            arrayIndex++;
        }

        //copy if remaining in Left
        while(i<n1){
            arr[arrayIndex] = Left[i];
            i++;
            arrayIndex++;
        }

        //copy if remaining in Right
        while(j<n2){
            arr[arrayIndex] = Right[j];
            j++;
            arrayIndex++;
        }

    }

    void sort(int arr[], int beg, int end) {
        if (beg < end) {

            int mid = (beg + end) / 2;

            sort(arr, beg, mid);
            
            sort(arr, mid + 1, end);
            
            merge(arr, beg, mid, end);
           
        }
    }

    public static void main(String args[]) {
        int arr[] = { 38, 27, 43, 3, 9, 82, 10 };
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//note
// Time Complexity: Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation. 
// T(n) = 2T(n/2) + θ(n)
// for all case complexity is O(n*logn)