package data_structures.queue;

// Efficient memory usage - First In First Out (FIFO)
public class CircularQueueArray<T> {
	
	T[] items;
	int size;
	int head = -1;
	int tail = -1;
	int numOfItems = 0;
	
	@SuppressWarnings("unchecked")
	public CircularQueueArray(int size) {
		this.size = size;
		this.items = (T[]) new Object[size];
	}
	
	public void enQueue(T item) {
		System.out.println("Adding an item " + item);
		if (isFull())
			throw new RuntimeException("Queue is full !");
		if (tail == size - 1) // deal with circular case
			tail = -1;
		items[++tail] = item;
		numOfItems++; // add 1 to the item count
	}

	public T deQueue() {
		if (isEmpty())
			throw new RuntimeException("Queue is empty !");
		if (head == size - 1) // deal with circular case
			head = -1;
		numOfItems--;  // remove 1 to the item count
		return items[++head];
	}

	public T peek() {
		return items[head+1];
	}
	
	public boolean isFull() {
		return numOfItems == size;
	}

	public boolean isEmpty() {
		return numOfItems == 0;
	}
	
	// Print all elements of Queue
	public void printCircularQueue() {
		System.out.println("Print All items of a Queue ..");
		int currentIndex = head;
		int numberOfItemsRead = 0;
		
		while (numberOfItemsRead < numOfItems) {
			
			if(currentIndex == size -1) { // deal with circular case
				currentIndex = -1;
			}
			
			System.out.println(items[++currentIndex]);
			numberOfItemsRead++;
		}
	}

	
}
