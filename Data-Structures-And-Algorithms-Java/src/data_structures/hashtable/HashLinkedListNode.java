package data_structures.hashtable;

public class HashLinkedListNode {
	int nodeKey;
	int nodeValue;
	HashLinkedListNode nextNode = null;
	
	public HashLinkedListNode(int nodeKey, int nodeValue) {
		super();
		this.nodeKey = nodeKey;
		this.nodeValue = nodeValue;
	}

	public HashLinkedListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(HashLinkedListNode nextNode) {
		this.nextNode = nextNode;
	}

	public int getNodeKey() {
		return nodeKey;
	}

	public int getNodeValue() {
		return nodeValue;
	}

	@Override
	public String toString() {
		return "Key: " + nodeKey + " Value: " + nodeValue;
	}

}
