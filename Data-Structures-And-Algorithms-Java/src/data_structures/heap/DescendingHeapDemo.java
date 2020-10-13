package data_structures.heap;

public class DescendingHeapDemo {

	public static void main(String[] args) {
		DescendingHeap descendingHeap = new DescendingHeap(10);
		descendingHeap.insert(26);
		descendingHeap.insert(5);
		descendingHeap.insert(12);
		descendingHeap.insert(14);
		descendingHeap.insert(22);
		descendingHeap.insert(43);
		descendingHeap.insert(2);
		descendingHeap.insert(62);
		descendingHeap.insert(1);
		descendingHeap.insert(121);
		//descendingHeap.insert(37);
		
		System.out.println("---------------------------");
		descendingHeap.printHeap();
		
		descendingHeap.deleteRoot();
		
		System.out.println("---------------------------");
		descendingHeap.printHeap();
		descendingHeap.deleteRoot();
		
		System.out.println("---------------------------");
		descendingHeap.printHeap();
		
		descendingHeap.deleteRoot();
		System.out.println("---------------------------");
		descendingHeap.printHeap();
		
	}

}
