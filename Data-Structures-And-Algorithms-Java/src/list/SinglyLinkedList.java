package list;

import java.util.List;

public class SinglyLinkedList<T> {
	
	SinglyLinkedListNode<T> head = null;
	
	public void addList(List<T> data) {
		for(int i=0; i<data.size(); i++) {
			T input = data.get(i);
			addNode(input);
		}
	}
	
	
	public void addNode(T item) {
		SinglyLinkedListNode<T> currentNode = head;
		
		// If list is empty, Insert at head
		if (head == null) {
			head = new SinglyLinkedListNode<T>(item);
		}else { // else Insert at end
			while(currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = new SinglyLinkedListNode<T>(item);
		}
	}

	
	public int size() {
		if (head == null) {
			return 0;
		} else {
			SinglyLinkedListNode<T> currentNode = head;
			int length = 1;
			
			while(currentNode.nextNode != null) {
				length = length + 1;
				currentNode = currentNode.nextNode;
			}
			return length;
		}
	}
	
	
	public void printSinglyLinkedList() {
		System.out.println("Printing a singly Linked List");
		SinglyLinkedListNode<T> currentNode = head;
		
		while(currentNode != null){
			System.out.println(currentNode);
			currentNode = currentNode.nextNode;
		}
	} 
	
	
	public void findNode(T item) {
		SinglyLinkedListNode<T> currentNode = head;
		int find_index = 0;
		
			while(currentNode != null) {
				find_index = find_index + 1;
				if(currentNode.getNodeValue().equals(item)) {
					System.out.println("Found Item " + item + " in SinglyLinkedList at position " + find_index);
					return;
				}
				currentNode = currentNode.nextNode;
			}
			
			System.out.println("Item " + item + " Not Found in SinglyLinkedList");
	}
	
	
	public void deleteNode(T item) {
		SinglyLinkedListNode<T> currentNode = head;
		
		// Empty list
		if (head == null) {
			return;
		}else {
			// Only one element
			if (currentNode != null && currentNode.nextNode == null) {
				if(currentNode.getNodeValue().equals(item)) {
					currentNode = currentNode.nextNode;
					head = currentNode;
					return;
				}
			}
			// More than one element
			while(currentNode.nextNode != null) {
				if(currentNode.nextNode.getNodeValue().equals(item)) {
					currentNode.nextNode = currentNode.nextNode.nextNode;
					return;
				}
				currentNode = currentNode.nextNode;
			}
			System.out.println("Item " + item + " not found in the List");
		}
	}

}
