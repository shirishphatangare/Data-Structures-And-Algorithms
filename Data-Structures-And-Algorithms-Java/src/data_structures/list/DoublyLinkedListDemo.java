package data_structures.list;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedListDemo {
	
	public static void main(String[] args) {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		System.out.println("Adding individual nodes..");
		
		System.out.println("Node added at position " + doublyLinkedList.addNodeEnd("Russia"));
		System.out.println("Node added at position " + doublyLinkedList.addNodeEnd("USA"));
		System.out.println("Node added at position " + doublyLinkedList.addNodeEnd("China"));
		
		// Get List size
		System.out.println("Size of List: " + doublyLinkedList.size());
		doublyLinkedList.printDoublyLinkedListForward();
		doublyLinkedList.printDoublyLinkedListBackward();
		
		System.out.println("---------------------------");
		System.out.println("Adding a list of nodes..");
		
		// Add list of Nodes
		List<String> input_data = new ArrayList<String>();
		input_data.add("Pakistan");
		input_data.add("Germany");
		input_data.add("Turkey");
		input_data.add("Peru");
		input_data.add("Srilanka");
		doublyLinkedList.addList(input_data);
		
		// Get List size
		System.out.println("Size of List: " + doublyLinkedList.size());
		doublyLinkedList.printDoublyLinkedListForward();
		
		System.out.println("---------------------------");
		System.out.println("Searching a node..");
		
		// Search a node
		String find_item = new String("Peru");
		doublyLinkedList.findNode(find_item);
		
		System.out.println("---------------------------");
		System.out.println("Adding individual node ..");
		System.out.println("Node added at position " + doublyLinkedList.addNodeAfter("Srilanka" , "Brazil"));
		System.out.println("Node added at position " + doublyLinkedList.addNodeBefore("Russia" , "India"));
		System.out.println("Node added at position " + doublyLinkedList.addNodeAfter("Srilanka" , "England"));
		System.out.println("Node added at position " + doublyLinkedList.addNodeBefore("India" , "Bhutan"));
		
		System.out.println("Size of List: " + doublyLinkedList.size());
		doublyLinkedList.printDoublyLinkedListForward();
		
		System.out.println("Deleting a node " + doublyLinkedList.deleteNode("Peru"));
		doublyLinkedList.printDoublyLinkedListForward();
		System.out.println("Deleting a node " + doublyLinkedList.deleteNode("Peru1"));
		System.out.println("Node added at position " + doublyLinkedList.addNodeEnd("Phillipine"));
		
		System.out.println("Size of List: " + doublyLinkedList.size());
		doublyLinkedList.printDoublyLinkedListBackward();
		
		System.out.println("---------------------------");
		
		// Delete a node
		System.out.println("Deleting a node " + doublyLinkedList.deleteNode("Phillipine"));
		System.out.println("Deleting a node " + doublyLinkedList.deleteNode("Bhutan"));
		
		System.out.println("Size of List: " + doublyLinkedList.size());
		
		// Print all nodes
		doublyLinkedList.printDoublyLinkedListForward();
	}
}
