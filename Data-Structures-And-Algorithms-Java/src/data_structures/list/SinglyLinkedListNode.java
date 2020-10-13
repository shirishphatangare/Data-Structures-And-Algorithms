package data_structures.list;

public class SinglyLinkedListNode<T> {
	
	T nodeValue;
	SinglyLinkedListNode<T> nextNode = null;
	
	public SinglyLinkedListNode(T nodeValue) {
		super();
		this.nodeValue = nodeValue;
	}

	public SinglyLinkedListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(SinglyLinkedListNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getNodeValue() {
		return nodeValue;
	}

	@Override
	public String toString() {
		return nodeValue.toString();
	}

}
