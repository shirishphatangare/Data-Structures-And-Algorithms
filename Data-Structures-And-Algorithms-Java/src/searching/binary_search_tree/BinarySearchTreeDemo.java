package searching.binary_search_tree;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		
		binarySearchTree.insert(52);
		binarySearchTree.insert(33);
		binarySearchTree.insert(25);
		binarySearchTree.insert(65);
		binarySearchTree.insert(60);
		binarySearchTree.insert(78);
		binarySearchTree.insert(39);
		binarySearchTree.insert(12);
		binarySearchTree.insert(27);
		binarySearchTree.insert(34);
		binarySearchTree.insert(48);
		
		binarySearchTree.printBinaryTree();
		
		System.out.println(binarySearchTree.find(2));
		System.out.println(binarySearchTree.find(33));
		System.out.println(binarySearchTree.find(24));
		System.out.println(binarySearchTree.find(1));
		System.out.println(binarySearchTree.find(12));
		
		binarySearchTree.delete(12); // Deleting leaf node
		binarySearchTree.printBinaryTree();
	}

}
