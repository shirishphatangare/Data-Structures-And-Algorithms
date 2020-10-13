package data_structures.queue;

public class LinearQueueArrayDemo {
static final int LINEAR_QUEUE_SIZE = 5;
	
	public static void main(String[] args) throws Exception {
		LinearQueueArray<Integer> linearQueue = new LinearQueueArray<Integer>(LINEAR_QUEUE_SIZE);
		
		linearQueue.enQueue(56);
		linearQueue.enQueue(85);
		linearQueue.enQueue(13);
		linearQueue.enQueue(7);
		linearQueue.enQueue(5);
		
		linearQueue.printLinearQueue();
		System.out.println("-------------------------------");
		System.out.println("Performing deQueue: " + linearQueue.deQueue());
		System.out.println("Performing deQueue: " + linearQueue.deQueue());
		
		linearQueue.printLinearQueue();
		
		System.out.println("-------------------------------");
		linearQueue.enQueue(15); // Problem with Linear Queue! Inefficient memory use. Queue full even when only 3 items are there in queue of size 5

		System.out.println("-------------------------------");
		System.out.println("Performing peek: " + linearQueue.peek());
		System.out.println("Performing peek: " + linearQueue.peek());

		linearQueue.printLinearQueue();
	}
}
