package sorting.HeapSort;

public class HeapSort {
	int[] input;
	int currentIndex = -1 ;
	
	public HeapSort(int[] unsortedArray){
		input = new int[unsortedArray.length];
		heapify(unsortedArray);
	}
	
	// Convert input array to heap data structure
	public void heapify(int[] unsortedArray){
		for(int i=0;i<unsortedArray.length;i++){
			insert(unsortedArray[i]);
		}
	}
	
	// Create Descending Heap by inserting an item one by one
	public void insert(int item){
		System.out.println("Inserting " + item);
		
		if(currentIndex == input.length -1 ){
			System.out.println("Heap is Full.. Skipping " + item);
			return;
		}
		input[++currentIndex] = item;
		fixUp();
	}

	// Fix Heap upwards - Used in insert operation
	public void fixUp() {
		int fixIndex = currentIndex; // Start fixing heap from currentIndex upwards
		
		while(fixIndex > 0) {
			int parentIndex = getParentIndex(fixIndex);
			if(input[fixIndex] > input[parentIndex]) {
			//if(input[fixIndex] < input[parentIndex]) { // For Ascending Heap	
				//swap
				int tmp = input[fixIndex];
				input[fixIndex] = input[parentIndex];
				input[parentIndex] = tmp;
				
				fixIndex = parentIndex; // Adjust fixIndex
			}else{
				break;
			}
		}
	}
	
	public void sort() {
		while(currentIndex > 0){
			// swap root item (highest) with last item (currentIndex)
			int tmp = input[0];
			input[0] = input[currentIndex];
			input[currentIndex--] = tmp; // Adjust currentIndex to skip already sorted items
			
			// Fix heap downwards after each swap
			fixDown();
		}
		
	}
	
	
	// Fix Heap downwards - Used in delete root operation 
	public void fixDown() {
		int fixIndex = 0; // Start fixing heap from index 0 downwards
		
		while(fixIndex <= getParentIndex(currentIndex)) {
			int leftChildIndex = 2 * fixIndex + 1;
			int rightChildIndex = 2 * fixIndex + 2;
			
			if(input[fixIndex] < input[leftChildIndex] || (rightChildIndex <= currentIndex && input[fixIndex] < input[rightChildIndex])) {
				int childToSwapIndex;
				if(rightChildIndex > currentIndex) {
					childToSwapIndex = leftChildIndex;
				} else {
					childToSwapIndex = (input[leftChildIndex] > input[rightChildIndex]) ? leftChildIndex : rightChildIndex;
				}
				// swap with child
				int tmp = input[fixIndex];
				input[fixIndex] = input[childToSwapIndex];
				input[childToSwapIndex] = tmp;
				
				fixIndex = childToSwapIndex;  // Adjust fixIndex
			}else{
				break;
			}
		}
	}
		
	
	private int getParentIndex(int index) {
		if(index % 2 == 1){ // odd Index
			return 	(index - 1) / 2;
		}else{ // even Index
			return 	(index - 2) / 2;
		}
	}

	public void printHeap() {
		System.out.println("Printing Heap...");
		for(int i=0 ;i <input.length;i++){
			System.out.println(i + ": " + input[i]);
		}
	}

}
