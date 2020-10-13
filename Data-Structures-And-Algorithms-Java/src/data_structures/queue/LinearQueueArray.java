package data_structures.queue;

// First In First Out (FIFO)
public class LinearQueueArray<T> {
	
	T[] linearQueue;
	int size;
	int head = -1;
	int tail = -1;
	int numberOfItems = 0;
	
	@SuppressWarnings("unchecked")
	public LinearQueueArray(int size) {
		this.size = size;
		this.linearQueue = (T[]) new Object[size];
	}
	
	// Add a new item at tail
	public void enQueue(T item) {
		System.out.println("Adding an item " + item);
		if(isFull()) {
			System.out.println("Linear Queue is Full !");
		}else {
			linearQueue[++tail] = item;
			numberOfItems++;
		}
	}
	
	public boolean isFull() {
		return numberOfItems == size;
	}
	
	public boolean isEmpty() {
		return numberOfItems == 0;
	}
	
	// Remove and return an item at head of the Queue
	public T deQueue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty !");
		}else {
			//numberOfItems--; // This step is skipped for linear queue, because we can not reuse this space
			return linearQueue[++head]; 
		}
	}
	
	// Return an item at head of the Queue without removing it
	public T peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty !");
		}else {
			return linearQueue[head + 1];
		}
	}
	
	// Print all elements of Queue
	public void printLinearQueue() {
		System.out.println("Print All items of a Queue ..");
		int currentItem = head;
		if (isEmpty()) {
			System.out.println("Nothing to print. Queue is empty");
			return;
		}
		
		while (currentItem < tail) {
			System.out.println(linearQueue[++currentItem]);
		}
	}
	
}
