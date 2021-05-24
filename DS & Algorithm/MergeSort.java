public class MergeSort  
{  
void merge(int arr[], int beg, int mid, int end)  
{  
    System.out.println("---------inside merge--------"+arr.length+"beg:"+beg+"mid:"+mid+"end:"+end);
    for(int i =0; i<arr.length;i++)  
{  
    System.out.println(arr[i]+"");  
}

int l = mid - beg + 1;  
int r = end - mid;  
  
int LeftArray[] = new int [l];  
int RightArray[] = new int [r];  
  
for (int i=0; i<l; ++i)  
LeftArray[i] = arr[beg + i];  
  
for (int j=0; j<r; ++j)  
RightArray[j] = arr[mid + 1+ j];  
  
  
int i = 0, j = 0;  
int k = beg;  
while (i<l&&j<r)  
{  
if (LeftArray[i] <= RightArray[j])  
{  
arr[k] = LeftArray[i];  
i++;  
}  
else  
{  
arr[k] = RightArray[j];  
j++;  
}  
k++;  
}  
while (i<l)  
{  
arr[k] = LeftArray[i];  
i++;  
k++;  
}  
  
while (j<r)  
{  
arr[k] = RightArray[j];  
j++;  
k++;  
}  

System.out.println("---------end merge--------"+arr.length);
for(int x =0; x<arr.length;x++)  
{  
System.out.println(arr[x]+"");  
}
}  


  
void sort(int arr[], int beg, int end)  
{  
if (beg<end)  
{  
int mid = (beg+end)/2;  
sort(arr, beg, mid);  
System.out.println("-----------------"); 
sort(arr , mid+1, end);  
System.out.println("***************"); 
merge(arr, beg, mid, end);  
System.out.println("+++++++++++++++"); 
}  
}  


public static void main(String args[])  
{  
int arr[] = {38, 27, 43, 3, 9, 82, 10};  
MergeSort ob = new MergeSort();  
ob.sort(arr, 0, arr.length-1);  
  
System.out.println("\nSorted array");  
for(int i =0; i<arr.length;i++)  
{  
    System.out.println(arr[i]+"");  
}  
}  
}  
