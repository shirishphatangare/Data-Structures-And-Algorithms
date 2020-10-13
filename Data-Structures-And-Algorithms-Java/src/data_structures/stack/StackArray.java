package data_structures.stack;

// Last In First Out (LIFO)
public class StackArray<T> {
	
	T[] stack ;
	int top = -1;
	int size = 0;
	
	@SuppressWarnings("unchecked")
	public StackArray(int size) {
		this.size = size;
		this.stack = (T[]) new Object[size]; // Generic type array
	}
	
	public void push(T item) {
		System.out.println("Pushing item " + item) ;
		if(top == size - 1) {
			System.out.println("Stack is Full !");
		}else {
			stack[++top] = item;
		}
	}
	
	public T pop() throws Exception {
		if(top == -1) {
			throw new Exception("Stack is Empty !"); // Throwing exception - so no complain of returning an item
		}else {
			return stack[top--]; // No actual item removal, just index adjustment
		}
	}
	
	public T peek() throws Exception {
		if(top == -1) {
			throw new Exception("Stack is Empty !"); 
		}else {
			return stack[top];
		}
	}
	
	public void printStack() {
		System.out.println("Printing complete Stack ..");
		int currentIndex = top;
		
		while (currentIndex != -1) {
			System.out.println(stack[currentIndex--]);
		}
	}
}
