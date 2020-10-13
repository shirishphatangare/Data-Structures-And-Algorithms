package searching.binary_search_tree;

// Binary Search Tree implementation in Java using singly Linked List
// Binary Search Tree is very versatile and fast data structure
// Every node can have at most two children
// Children on left side have node values lesser than root node
// Children on right side have node values greater than or equal to root node
// A balanced binary tree performs well in terms of Time complexity
// A Binary Search Tree can be implemented with array or linked list
// Recursive approach is better and easier than iterative approach while dealing with BinarySearchTree

public class BinarySearchTree<T extends Comparable<T>> {
	BinarySearchTreeNode<T> head = null;
	//BinarySearchTreeNode<T> currentNode = null;
	
	public boolean insert(T item) {
		if(head == null) {
			BinarySearchTreeNode<T> node = new BinarySearchTreeNode<T>(item);
			head = node;
		}else{
			findSlot(head, item);
		}
		return true;
	} 
	
	
	public void findSlot(BinarySearchTreeNode<T> currentNode, T item){
		if (currentNode.getData().compareTo(item) < 0) { // item  >= currentNode.getData() // Right Node
			if(currentNode.rightNode != null){
				findSlot(currentNode.rightNode, item);
			}
			else{
				BinarySearchTreeNode<T> node = new BinarySearchTreeNode<T>(item);
				currentNode.rightNode = node;
			}
		} else{ // Left Node
			if(currentNode.leftNode != null){
				findSlot(currentNode.leftNode, item);
			}else{
				BinarySearchTreeNode<T> node = new BinarySearchTreeNode<T>(item);
				currentNode.leftNode = node;
			}
		}
	}
	
	
	public BinarySearchTreeNode<T> find(T item){
		return searchItem(head, item);
	}
	
	
	public BinarySearchTreeNode<T> searchItem(BinarySearchTreeNode<T> currentNode, T item) {
		if (currentNode.getData().compareTo(item) < 0) { // item  >= currentNode.getData() // Right Node
			if(currentNode.rightNode != null){
				return searchItem(currentNode.rightNode, item);
			}
			else{
				System.out.print("Item " + item + " not found " );
				return null;
			}
		} else if (currentNode.getData().compareTo(item) > 0) { // Left Node
			if(currentNode.leftNode != null) {
				return searchItem(currentNode.leftNode, item);
			}else{
				System.out.print("Item " + item + " not found " );
				return null;
			}
		} else{ // Found item
			System.out.print("Item found ");
			return currentNode;
		}
	}
	
	
	public boolean delete(T item) {
		return removeItem(head, head, item);
	}

	
	public boolean removeItem(BinarySearchTreeNode<T> parentNode, BinarySearchTreeNode<T> currentNode, T item) {
		if (currentNode.getData().compareTo(item) < 0) { // item  >= currentNode.getData() // Right Node
			if(currentNode.rightNode != null){
				return removeItem(currentNode, currentNode.rightNode, item);
			}
			else{
				System.out.println("Item " + item + " not found " );
				return false;
			}
		} else if (currentNode.getData().compareTo(item) > 0) { // Left Node
			if(currentNode.leftNode != null) {
				return removeItem(currentNode, currentNode.leftNode, item);
			}else{
				System.out.println("Item " + item + " not found " );
				return false;
			}
		} else{ // Found item
			// Case 1) Delete a leaf node
			if (parentNode.leftNode == currentNode) {
				parentNode.leftNode = null;
			}else {
				parentNode.rightNode = null;
			}
			
			// Case 2) Delete a node with one child - Not implemented - Delete only node in question and not it's child node. Adjust pointer to accommodate child node.
			// Case 3) Delete a node with 2 children - Not implemented - Delete only node in question. Find successor node and then adjust pointers.
			// Do avoid complexities of node deletion and pointer adjustment, we can simply mark node as deleted with a flag and ignore it during node operations. (Soft delete) 
			System.out.println("Item " + item + " found and deleted ");
			return true;
		}
	}
	
	
	// In-order Traversal -  Left SubTree --> Root --> Right subTree
	public void printBinaryTree() {
		inOrderTraversal(head);
	}
	
	
	public void inOrderTraversal(BinarySearchTreeNode<T> currentNode) {
		if (currentNode.leftNode != null) {
			inOrderTraversal(currentNode.leftNode);
		}
		
		System.out.println(currentNode.data);
		
		if (currentNode.rightNode != null) {
			inOrderTraversal(currentNode.rightNode);
		}
	}
	
}
