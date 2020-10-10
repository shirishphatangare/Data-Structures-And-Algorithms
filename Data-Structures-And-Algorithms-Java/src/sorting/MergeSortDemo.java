package sorting;

public class MergeSortDemo {

	public static void main(String[] args) {
		
		int[] input = {1,1,1,23,345,2,85223,12,757,16,9,34,12,56565,232,13,53,2,13,4,1,1,23,12,1,1};
		MergeSort mergeSort = new MergeSort();

		System.out.println("Initial Array of size " + input.length + " is: " );
		mergeSort.printArray(input);

		mergeSort.mergeSort(input, 0, input.length - 1);
		
		System.out.println("Sorted Array of size " + input.length + " is: " );
		mergeSort.printArray(input);

	}

}
