package searching.binary_search_tree;

public class BinarySearchTreeNode<T> {
	
	T data;
	BinarySearchTreeNode<T> leftNode;
	BinarySearchTreeNode<T> rightNode;
	
	public BinarySearchTreeNode(T data) {
		this.data = data;
	}

	public BinarySearchTreeNode<T> getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinarySearchTreeNode<T> leftNode) {
		this.leftNode = leftNode;
	}

	public BinarySearchTreeNode<T> getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinarySearchTreeNode<T> rightNode) {
		this.rightNode = rightNode;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return data.toString();
	}
	
	
	
	
	
	
}
