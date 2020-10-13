package data_structures.queue;

// Priority Queue is implemented using Heap data structure
// Keys at each node of Priority Queue represents priority of an node
// Root node always have highest priority (Descending heap)
// New item is added at end of heap (Fix up operation required)
// For poll operation, root element needs to be removed (fix down operation is required)
public class PriorityQueueHeap {
	Integer[] input;
	Integer currentIndex = -1 ;
	
	public PriorityQueueHeap(Integer size) {
		input = new Integer[size]; 
		
		for(int i=0 ;i <input.length;i++){
			input[i] = -1; // -1 indicates no node
		}
	}
	
	public boolean add(Integer item) {
		System.out.println("Inserting " + item);
		
		if(currentIndex == input.length -1 ){
			System.out.println("Heap is Full.. Skipping " + item);
			return false;
		}
		input[++currentIndex] = item;
		fixUp();
		return true;
	}
	
	// Fix Heap upwards - Used in insert operation
	public void fixUp() {
		int fixIndex = currentIndex; // Start fixing heap from currentIndex upwards
		
		while(fixIndex > 0) {
			int parentIndex = getParentIndex(fixIndex);
			if(input[fixIndex] > input[parentIndex]) {
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
	
	private int getParentIndex(int index) {
		if(index % 2 == 1){ // odd Index
			return 	(index - 1) / 2;
		}else{ // even Index
			return 	(index - 2) / 2;
		}
	}

	public void printHeap() {
		System.out.println("Printing Priority Queue...");
		for(int i=0 ;i <input.length;i++){
			System.out.println(i + ": " + input[i]);
		}
	}

	// Poll returns and removes item from queue - Equivalent of deleteRoot operation of heap
	public Integer poll() {
		System.out.println("Polling Root...");
		
		if(currentIndex == -1) {
			System.out.println("Heap is empty..");
			return null;
		}
		
		Integer rootElement = input[0];
		// Delete root by replacing it with last element of heap
		input[0] = input[currentIndex];
		input[currentIndex--] = -1; // -1 indicates no node
		fixDown();
		return rootElement;
	}
	
	
	// Fix Heap downwards - Used in poll operation 
	public void fixDown() {
		int fixIndex = 0; // Start fixing heap from index 0 downwards
		
		while(fixIndex <= getParentIndex(currentIndex)) {
			int leftChildIndex = 2 * fixIndex + 1;
			int rightChildIndex = 2 * fixIndex + 2;
			
			if(input[fixIndex] < input[leftChildIndex] || input[fixIndex] < input[rightChildIndex]) {
				int childToSwapIndex = (input[leftChildIndex] > input[rightChildIndex]) ? leftChildIndex : rightChildIndex;
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

	// Peek returns an item from queue without removing it
	public Integer peek() {
		System.out.println("Peeking Root...");
		
		if(currentIndex == -1) {
			System.out.println("Heap is empty..");
			return null;
		}
		
		return input[0];
	}
	
}
