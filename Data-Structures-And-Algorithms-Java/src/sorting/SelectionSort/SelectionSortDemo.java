package sorting.SelectionSort;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int[] input = {32,63,1,56,87,853,86257,31,8};
		SelectionSort selectionSort = new SelectionSort(input);
		System.out.println("Array of size " + input.length + " before sorting");
		selectionSort.printArray();
		System.out.println("----------------------------");
		selectionSort.sort();
		System.out.println("Array of size " + input.length + " after sorting");
		selectionSort.printArray();
	}

}
