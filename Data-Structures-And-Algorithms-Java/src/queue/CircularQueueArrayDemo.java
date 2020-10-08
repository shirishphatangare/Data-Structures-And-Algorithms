package queue;

public class CircularQueueArrayDemo {

	static final int CIRCULAR_QUEUE_SIZE = 5;
	
	public static void main(String[] args) throws Exception {
		CircularQueueArray<Integer> circularQueue = new CircularQueueArray<Integer>(CIRCULAR_QUEUE_SIZE);
		
		circularQueue.enQueue(56);
		circularQueue.enQueue(85);
		circularQueue.enQueue(13);
		circularQueue.enQueue(7);
		circularQueue.enQueue(5);
		//circularQueue.enQueue(53); // Queue is Full !
		
		circularQueue.printCircularQueue();
		System.out.println("-------------------------------");
		System.out.println("Performing deQueue: " + circularQueue.deQueue());
		System.out.println("Performing deQueue: " + circularQueue.deQueue());
		
		circularQueue.printCircularQueue();
		
		System.out.println("-------------------------------");
		circularQueue.enQueue(15); // Problem with Linear Queue solved!
		circularQueue.enQueue(75);
		//circularQueue.enQueue(25);
		//circularQueue.enQueue(58);
		circularQueue.printCircularQueue();
		
		System.out.println("Performing deQueue: " + circularQueue.deQueue());
		System.out.println("Performing deQueue: " + circularQueue.deQueue());
		circularQueue.enQueue(75);
		System.out.println("Performing deQueue: " + circularQueue.deQueue());
		System.out.println("Performing deQueue: " + circularQueue.deQueue());
		System.out.println("Performing deQueue: " + circularQueue.deQueue());
		System.out.println("Performing deQueue: " + circularQueue.deQueue());
		//System.out.println("Performing deQueue: " + circularQueue.deQueue()); // Queue is empty
		circularQueue.enQueue(75);
		
		circularQueue.printCircularQueue();

		System.out.println("-------------------------------");
		System.out.println("Performing peek: " + circularQueue.peek());
		System.out.println("Performing peek: " + circularQueue.peek());

		circularQueue.printCircularQueue();
	}

}
