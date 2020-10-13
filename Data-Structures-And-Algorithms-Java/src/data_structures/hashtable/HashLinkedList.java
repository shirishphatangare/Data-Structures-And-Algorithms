package data_structures.hashtable;

public class HashLinkedList {
	
	HashLinkedListNode head = null;
	
	public void addNode(int key, int value) {
		HashLinkedListNode currentNode = head;
		
		// If list is empty, Insert at head
		if (head == null) {
			head = new HashLinkedListNode(key, value);
		}else { // else Insert at end
			while(currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = new HashLinkedListNode(key, value);
		}
	}

	
	public int size() {
		if (head == null) {
			return 0;
		} else {
			HashLinkedListNode currentNode = head;
			int length = 1;
			
			while(currentNode.nextNode != null) {
				length = length + 1;
				currentNode = currentNode.nextNode;
			}
			return length;
		}
	}
	
	public void printHashLinkedList() {
		HashLinkedListNode currentNode = head;
		
		while(currentNode != null){
			System.out.println(currentNode);
			currentNode = currentNode.nextNode;
		}
	} 
	
	
	public int findNode(int key) {
		HashLinkedListNode currentNode = head;
		while(currentNode != null) {
			if(currentNode.getNodeKey() == key) {
				return currentNode.getNodeValue();
			}
			currentNode = currentNode.nextNode;
		}
		return -1;
	}
	
	
	public void deleteNode(int key) {
		HashLinkedListNode currentNode = head;
		
		// Empty list
		if (head == null) {
			return;
		}else {
			// Only one element
			if (currentNode != null && currentNode.nextNode == null) {
				if(currentNode.getNodeKey() == key) {
					currentNode = currentNode.nextNode;
					head = currentNode;
					return;
				}
			}
			// More than one element
			while(currentNode.nextNode != null) {
				if(currentNode.nextNode.getNodeKey() == key) {
					currentNode.nextNode = currentNode.nextNode.nextNode;
					return;
				}
				currentNode = currentNode.nextNode;
			}
		}
	}

}
