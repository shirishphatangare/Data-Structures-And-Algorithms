package sorting.HeapSort;

public class HeapSortDemo {

	public static void main(String[] args) {
		int[] unsortedArray = {847,12,42,524,1,4,5,3,13,3224,86,37,86,99,100,86,2};
		HeapSort heapSort = new HeapSort(unsortedArray);
		System.out.println("Initial Heap ");
		heapSort.printHeap();
		
		heapSort.sort();

		System.out.println("Sorted Heap ");
		heapSort.printHeap();
	}
}
