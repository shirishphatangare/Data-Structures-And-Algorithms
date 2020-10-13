package sorting.BubbleSort;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] input = {32,63,1,56,87,853,86257,31,8};
		BubbleSort bubbleSort = new BubbleSort(input);
		System.out.println("Array of size " + input.length + " before sorting");
		bubbleSort.printArray();
		System.out.println("----------------------------");
		bubbleSort.sort();
		System.out.println("Array of size " + input.length + " after sorting");
		bubbleSort.printArray();
	}

}
