import java.util.Arrays;

public class Quick {

    public static int partition(Integer[] array, int beg, int end){
        
        int pivot = array[beg+(end-beg)/2];
        
        int low = beg;
        int high = end;
        while(low<=high){

            while(array[low]<pivot){
                low++;
            }
            while(array[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = array[low];
                array[low] = array[high];
                array[high]= temp;
                low++;
                high--;
            }
        }
        
        return low;
    }
    public static void quickSort(Integer[] array,int beg, int end){
        

            int partitionIndex = partition(array,beg,end);

            if (beg < partitionIndex-1)
            quickSort(array,beg,partitionIndex-1);

            if (partitionIndex+1 < end)
            quickSort(array,partitionIndex+1,end);
        
        
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] { 5, 7, 2, 4, 0, 12, 0, 1 };
        int length = array.length-1;

        quickSort(array, 0, length);

        System.out.println("array is :"+Arrays.toString(array));
    }
}

//note
// The time complexity is depemded on the position of the 'pivot'
//best case
//when pivot is in the middle of list, list will be divided into n/2  on partition at each level
// for 'k' level it will logn
//each level it takes 'n' elements
// complexity is O(n*logn)

//worst case
//when list is already sorted and takes 'first element' as 'pivot'
//for each partition it creates n-k elements on right side, where 'k' is the current level
//ie.. it forms n+(n-1)+(n-2).. =n(n+1)/2 = n2+n = n2
// so worst case is n2.

