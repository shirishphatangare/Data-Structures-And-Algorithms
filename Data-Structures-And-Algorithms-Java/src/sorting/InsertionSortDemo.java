package sorting;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int[] input = {32,63,1,56,87,853,86257,31,8};
		InsertionSort insertionSort = new InsertionSort(input);
		System.out.println("Array of size " + input.length + " before sorting");
		insertionSort.printArray();
		System.out.println("----------------------------");
		insertionSort.sort();
		System.out.println("Array of size " + input.length + " after sorting");
		insertionSort.printArray();

	}

}
