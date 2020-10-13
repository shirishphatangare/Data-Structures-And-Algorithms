package data_structures.list;

import java.util.List;

public class DoublyLinkedList<T> {
	
	DoublyLinkedListNode<T> head = null;
	
	public void addList(List<T> data) {
		for(int i=0; i<data.size(); i++) {
			T input = data.get(i);
			addNodeEnd(input);
		}
	}
	
	
	public int addNodeEnd(T item) {
		
		int add_index = 1;
		
		// If list is empty, Insert at head
		if (head == null) {
			DoublyLinkedListNode<T> node = new DoublyLinkedListNode<T>(item);
			head = node;
			return add_index;
		}else { // else Insert at end
			DoublyLinkedListNode<T> currentNode = head;
			
			while(currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
				add_index++;
			}
			DoublyLinkedListNode<T> node = new DoublyLinkedListNode<T>(item);
			currentNode.nextNode = node;
			node.preNode = currentNode;
			return ++add_index; // Item added at position add_index 
		}
	}
	
	
	public int addNodeAfter(T item, T itemToBeAdded) {
		DoublyLinkedListNode<T> currentNode = head;
		int add_index = 0;
		
			while(currentNode != null) {
				add_index++;
				if(currentNode.getNodeValue().equals(item)) {
					DoublyLinkedListNode<T> node = new DoublyLinkedListNode<T>(itemToBeAdded);
					node.nextNode = currentNode.nextNode;
					node.preNode = currentNode;
					if(currentNode.nextNode != null){
						currentNode.nextNode.preNode = node;
					}
					currentNode.nextNode = node;
					return ++add_index; // Item added at position add_index
				}
				currentNode = currentNode.nextNode;
			}
			return -1; // Item not found
	}
	
	public int addNodeBefore(T item, T itemToBeAdded) {
		DoublyLinkedListNode<T> currentNode = head;
		int add_index = 0;
		
			while(currentNode != null) {
				add_index++;
				if(currentNode.getNodeValue().equals(item)) {
					DoublyLinkedListNode<T> node = new DoublyLinkedListNode<T>(itemToBeAdded);
					node.nextNode = currentNode;
					node.preNode = currentNode.preNode;
					if(currentNode.preNode != null){
						currentNode.preNode.nextNode = node;
					}
					currentNode.preNode = node;

					if (head == currentNode) {
						head = node;
					}
					
					return add_index; // Item added at position add_index
				}
				currentNode = currentNode.nextNode;
			}
			return -1; // Item not found
	}

	
	public int size() {
		if (head == null) {
			return 0;
		} else {
			DoublyLinkedListNode<T> currentNode = head;
			int length = 1;
			
			while(currentNode.nextNode != null) {
				length = length + 1;
				currentNode = currentNode.nextNode;
			}
			return length;
		}
	}
	
	
	public void printDoublyLinkedListForward() {
		System.out.println("Printing a doubly Linked List in forward direction");
		DoublyLinkedListNode<T> currentNode = head;
		
		while(currentNode != null){
			System.out.println(currentNode);
			currentNode = currentNode.nextNode;
		}
	} 
	
	
	public void printDoublyLinkedListBackward() {
		System.out.println("Printing a doubly Linked List in backward direction");
		DoublyLinkedListNode<T> currentNode = head;
		
		// Go to the last node - We don't have tail pointer in doubly Linked List (Double ended List has head and tail pointers)
		while(currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
		}
		
		// Traverse back to the first node
		while(currentNode != null) {
			System.out.println(currentNode);
			currentNode = currentNode.preNode;
		}
	} 
	
	
	public void findNode(T item) {
		DoublyLinkedListNode<T> currentNode = head;
		int find_index = 0;
		
			while(currentNode != null) {
				find_index = find_index + 1;
				if(currentNode.getNodeValue().equals(item)) {
					System.out.println("Found Item " + item + " in DoublyLinkedList at position " + find_index);
					return;
				}
				currentNode = currentNode.nextNode;
			}
			
			System.out.println("Item " + item + " Not Found in DoublyLinkedList");
	}
	
	
	public int deleteNode(T item) {
		DoublyLinkedListNode<T> currentNode = head;
		int add_index = 0;
		
		// Empty list
		if (head == null) {
			return -1;
		}else {
			while(currentNode != null) {
				add_index++;
				if(currentNode.getNodeValue().equals(item)) {
					if (currentNode == head && currentNode.nextNode == null) { // Node to be deleted is the only node in list at head
						head = currentNode = null;
					}else{ // intermediate node delete
						if(currentNode.preNode != null){
							currentNode.preNode.nextNode = currentNode.nextNode;
						}
						
						if(currentNode.nextNode != null){
							currentNode.nextNode.preNode = currentNode.preNode;
							if (currentNode == head){
								head = currentNode.nextNode;
							}
						}
					}
					return add_index; // Item deleted at position add_index
				}
				currentNode = currentNode.nextNode;
			}
			
			System.out.println("Item " + item + " not found in the List");
			return -1;
		}
	}

}
