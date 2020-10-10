package sorting;

// Worst case Time complexity - O(n²)
public class BubbleSort {
	
	int[] input;
	
	public BubbleSort(int[] input) {
		this.input = input;
	}
	
	public void sort() {
		for (int i=0; i<(input.length-1);i++) { // Itertions
			for (int j=0; j<(input.length-1-i);j++) { // Comparison and swapping of adjacent array elements.
				// In first iteration, largest (in ascending sort) element bubbles to end of an array  
				// In second iteration, second largest (in ascending sort) element bubbles to second last index of an array
				// and so on..
				if(input[j] > input[j+1]) { // Ascending sort
					int tmp = input[j+1];
					input[j+1] = input[j];
					input[j] = tmp;
				}
			}
			//System.out.println("End of " + i + " iteration");
			//System.out.println("Element at End of array " + input[input.length - 1]);
		}
	}
	
	public void printArray() {
		for (int i=0; i<input.length;i++) { 
			System.out.println(input[i]);
		}
	}
}
