package data_structures.queue;

public class PriorityQueueHeapDemo {

	public static void main(String[] args) {
		PriorityQueueHeap priorityQueueHeap = new PriorityQueueHeap(10);
		priorityQueueHeap.add(26);
		priorityQueueHeap.add(5);
		priorityQueueHeap.add(12);
		priorityQueueHeap.add(14);
		priorityQueueHeap.add(22);
		priorityQueueHeap.add(43);
		priorityQueueHeap.add(2);
		priorityQueueHeap.add(62);
		priorityQueueHeap.add(1);
		priorityQueueHeap.add(121);
		//priorityQueueHeap.add(37); // Queue is full
		
		System.out.println("---------------------------");
		priorityQueueHeap.printHeap();
		
		System.out.println(priorityQueueHeap.poll());
		
		System.out.println("---------------------------");
		priorityQueueHeap.printHeap();
		System.out.println(priorityQueueHeap.peek());
		
		System.out.println("---------------------------");
		priorityQueueHeap.printHeap();
		
		System.out.println(priorityQueueHeap.poll());
		System.out.println(priorityQueueHeap.peek());
		System.out.println("---------------------------");
		priorityQueueHeap.printHeap();
	}
}
