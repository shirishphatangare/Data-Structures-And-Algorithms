package searching.ordered_array;

import java.util.Random;

import searching.binary_search_tree.BinarySearchTree;

public class OrderedArrayDemo {

	/*public static void main(String[] args) {
		OrderedArray oa = new OrderedArray(10);
		oa.insert(5);
		oa.insert(4);
		oa.insert(10);
		oa.insert(7);
		oa.insert(3);
		oa.insert(6);
		oa.insert(8);
		
		System.out.println(oa);
		System.out.println(oa.binarySearch(8));
		oa.delete(5);
		System.out.println(oa);
	}*/
	
	
	/* Performance
    //  Insert --
	    Takes 175800 nanos for insert in Ordered Array
		Takes 1200 nanos for insert in Binary Search Tree
		
	// Search -- 
		Takes 485500 nanos for search in Ordered Array
		Takes 56800 nanos for search in Binary Search Tree
	*/
	
	public static void main(String[] args) {
		int lengthOfArray = 100000;
		OrderedArray oa = new OrderedArray(lengthOfArray);
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		
		//populate the array with some random numbers
		Random rand = new Random(System.currentTimeMillis());
		
		for (int i=0; i < lengthOfArray; i++) {
			int ii = rand.nextInt(1000001);
			//long start = System.nanoTime();
			oa.insert(ii);
			//long end = System.nanoTime();
			//System.out.println("Takes " + (end-start) + " nanos for insert in Ordered Array");
			
			//long start2 = System.nanoTime();
			binarySearchTree.insert(ii);
			//long end2 = System.nanoTime();
			//System.out.println("Takes " + (end2-start2) + " nanos for insert in Binary Search Tree");
		}
		
		long start = System.nanoTime();
		System.out.println(oa.binarySearch(89890));
		long end = System.nanoTime();
		System.out.println("Takes " + (end-start) + " nanos for search in Ordered Array");
		
		long start2 = System.nanoTime();
		binarySearchTree.find(89890);
		long end2 = System.nanoTime();
		System.out.println("Takes " + (end2-start2) + " nanos for search in Binary Search Tree");
	}
	
}
