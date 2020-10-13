package sorting.QuickSort;

public class QuickSortDemo {

	public static void main(String[] args) {
		int[] A =  {1,1,1,23,345,2,85223,12,757,16,9,34,12,56565,232,13,53,2,13,4,1,1,23,12,1,1};
		QuickSort quickSort = new QuickSort();
		System.out.println("Initial Array A ");
		quickSort.printArray(A);
		quickSort.quickSort(A, 0, A.length - 1);
		System.out.println("Sorted Array A ");
		quickSort.printArray(A);
	}

}
