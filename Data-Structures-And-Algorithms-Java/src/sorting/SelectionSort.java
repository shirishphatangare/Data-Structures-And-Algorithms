package sorting;


// Worst case Time complexity - O(n²)
public class SelectionSort {

	int[] input;
	
	public SelectionSort(int[] input) {
		this.input = input;
	}
	
	public void sort() {
		for(int i=0 ;i< input.length-1;i++) { // iterations
			int minIndex = i; // start with first element of array as a minimum element
			
			// find index of minimum element (minIndex) 
			for(int j=i+1 ;j< input.length;j++) { // Compare input[minIndex] with right side of array
				if(input[j] < input[minIndex]) {
					minIndex = j; // Move minIndex to j, if input[j] < input[minIndex]
				}
			}
			// In First iteration of i, minimum element moves to 0th index (ascending sort)
			// In Second iteration of i, second minimum element moves to 1st index (ascending sort)
			// and so on..
			int tmp = input[minIndex];
			input[minIndex] = input[i];
			input[i] = tmp;
		}
	}
	
	
	public void printArray() {
		for (int i=0; i<input.length;i++) { 
			System.out.println(input[i]);
		}
	}
	
}
