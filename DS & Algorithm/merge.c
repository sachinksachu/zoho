/* C program for Merge Sort */
#include <stdio.h>
#include <stdlib.h>

// Merges two subarrays of arr[].
// First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
void merge(int arr[], int l, int m, int r)
{   
    
	int i, j, k;
	int n1 = m - l + 1;
	int n2 = r - m;

	/* create temp arrays */
	int L[n1], R[n2];

    printf("\nMerging the array with lft = %d\t mid = %d\t rgth = %d array values = %d, %d", l, m, r, arr[l], arr[r]);
	/* Copy data to temp arrays L[] and R[] */
	for (i = 0; i < n1; i++)
		L[i] = arr[l + i];
	for (j = 0; j < n2; j++)
		R[j] = arr[m + 1 + j];

	/* Merge the temp arrays back into arr[l..r]*/
	i = 0; // Initial index of first subarray
	j = 0; // Initial index of second subarray
	k = l; // Initial index of merged subarray
	while (i < n1 && j < n2) {
		if (L[i] <= R[j]) {
			arr[k] = L[i];
			i++;
		}
		else {
			arr[k] = R[j];
			j++;
		}
		k++;
	}

	/* Copy the remaining elements of L[], if there
	are any */
	while (i < n1) {
		arr[k] = L[i];
		i++;
		k++;
	}

	/* Copy the remaining elements of R[], if there
	are any */
	while (j < n2) {
		arr[k] = R[j];
		j++;
		k++;
	}
}

/* l is for left index and r is right index of the
sub-array of arr to be sorted */
void mergeSort(int arr[], int l, int r, int xx)
{
    printf("\n--------------------1----------\n");
	if (l < r) {
		// Same as (l+r)/2, but avoids overflow for
		// large l and h
		int m = l + (r - l) / 2;
        
        printf("\nSpliting l = %d, m= %d r= %d xx=%d", l,m, r,xx);

		// Sort first and second halves
		mergeSort(arr, l, m,xx=1);
        printf("\n000000000000000000000000\n");
		
		mergeSort(arr, m + 1, r,xx=2);
		printf("\nSpliting llllll = %d, m= %d r= %d xx=%d", l,m, r,xx);
        printf("\n11111111111111111111111\n");

		merge(arr, l, m, r);
        printf("\n22222222222222222222222\n");
	}
}

/* UTILITY FUNCTIONS */
/* Function to print an array */
void printArray(int A[], int size)
{
	int i;
	for (i = 0; i < size; i++)
		printf("%d ", A[i]);
	printf("\n");
}

/* Driver code */
int main()
{
	int arr[] = { 38, 27, 43, 3, 9, 82, 10};
	int arr_size = sizeof(arr) / sizeof(arr[0]);

	printf("Given array is \n");
	printArray(arr, arr_size);

	mergeSort(arr, 0, arr_size - 1,0);

	printf("\nSorted array is \n");
	printArray(arr, arr_size);
	return 0;
}