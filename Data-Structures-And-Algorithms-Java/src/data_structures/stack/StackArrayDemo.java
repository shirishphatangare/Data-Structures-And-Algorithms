package data_structures.stack;

public class StackArrayDemo {
	static final int STACK_SIZE = 5;
	
	public static void main(String[] args) throws Exception{
		StackArray<String> stackArray = new StackArray<String>(STACK_SIZE);
		
		stackArray.push("Nepal");
		stackArray.push("Bhutan");
		stackArray.push("Israel");
		stackArray.push("India");
		stackArray.push("Pakistan");
		stackArray.push("Oman");
		
		stackArray.printStack();
		System.out.println("-------------------------");
		
		System.out.println("Pop an item " + stackArray.pop());
		System.out.println("Pop an item " + stackArray.pop());
		System.out.println("Pop an item " + stackArray.pop());
		System.out.println("Pop an item " + stackArray.pop());
		//System.out.println("Pop an item " + stackArray.pop());
		//System.out.println("Pop an item " + stackArray.pop()); // Empty stack for pop
		
		stackArray.printStack();
		System.out.println("-------------------------");
		
		System.out.println("Peek an item " + stackArray.peek());
		System.out.println("Peek an item " + stackArray.peek());
		
		stackArray.printStack();
		
	}

}
