package data_structures.list;

public class DoublyLinkedListNode<T> {
	
	T nodeValue;
	DoublyLinkedListNode<T> preNode = null;
	DoublyLinkedListNode<T> nextNode = null;
	
	public DoublyLinkedListNode(T nodeValue) {
		super();
		this.nodeValue = nodeValue;
	}

	public DoublyLinkedListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoublyLinkedListNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public DoublyLinkedListNode<T> getPreNode() {
		return preNode;
	}

	public void setPreNode(DoublyLinkedListNode<T> preNode) {
		this.preNode = preNode;
	}

	public T getNodeValue() {
		return nodeValue;
	}

	@Override
	public String toString() {
		return nodeValue.toString();
	}

}
