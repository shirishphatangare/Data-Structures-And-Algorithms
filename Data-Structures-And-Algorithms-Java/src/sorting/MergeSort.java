package sorting;

// Merge sort using Recursion
// Worst case Time complexity - O(nlogn)
public class MergeSort {
	
	// Merge sort step - Break-down initial array into individual arrays of one item each (conceptually) 
	public void mergeSort(int[] input, int start, int end) {
		if (start < end) { // Breaking condition for recursion
			int middle = (int)Math.floor((start + end) / 2);
			mergeSort(input, start, middle);
			mergeSort(input, middle+1, end);
			merge(input,start,middle,end);
		}
	}
	
	// Merge step - Merge these individual arrays of one item each back to resultant sorted array (Uses 2 temporary arrays)
	public void merge(int[] input, int start, int middle, int end) {
		int temp_array1_length = middle - start + 1;
		int temp_array2_length = end - middle;
		
		int[] temp_array1 = new int[temp_array1_length];
		int[] temp_array2 = new int[temp_array2_length];
		
		
		for(int i=0 ;i<temp_array1_length;i++){
			temp_array1[i] = input[start + i]; // middle inclusive
		}
		
		for(int j=0 ;j<temp_array2_length;j++){
			temp_array2[j] = input[middle + 1 + j]; // middle exclusive
		}

		int i = 0;
		int j = 0;

		// Merge and sort initial array by comparing 2 temporary arrays
		for(int k=start; k<=end; k++) {
			if(j >= temp_array2_length || (i < temp_array1_length && temp_array1[i] <= temp_array2[j])) {
				input[k] = temp_array1[i++]; // Once item is sorted and moved to input array, we don't have to revisit it.
			}else {
				input[k] = temp_array2[j++]; // Once item is sorted and moved to input array, we don't have to revisit it.
			}
		}
	}
	
	public void printArray(int[] input) {
		
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
		
	}
	

}
