package data_structures.list;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedListDemo {
	
	public static void main(String[] args) {
		SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();
		System.out.println("Adding individual nodes..");
		
		// Add individual Node
		singlyLinkedList.addNode("Russia");
		singlyLinkedList.addNode("USA");
		singlyLinkedList.addNode("China");
		
		// Get List size
		System.out.println("Size of List: " + singlyLinkedList.size());
		singlyLinkedList.printSinglyLinkedList();
		
		System.out.println("---------------------------");
		System.out.println("Adding a list of nodes..");
		
		// Add list of Nodes
		List<String> input_data = new ArrayList<String>();
		input_data.add("Pakistan");
		input_data.add("Germany");
		input_data.add("Turkey");
		input_data.add("Peru");
		input_data.add("Srilanka");
		singlyLinkedList.addList(input_data);
		
		// Get List size
		System.out.println("Size of List: " + singlyLinkedList.size());
		singlyLinkedList.printSinglyLinkedList();
		
		System.out.println("---------------------------");
		System.out.println("Searching a node..");
		
		// Search a node
		String find_item = new String("Peru1");
		singlyLinkedList.findNode(find_item);
		
		System.out.println("---------------------------");
		System.out.println("Adding individual node..");
		singlyLinkedList.addNode("India");
		
		System.out.println("Size of List: " + singlyLinkedList.size());
		singlyLinkedList.printSinglyLinkedList();
		
		System.out.println("---------------------------");
		System.out.println("Deleting a node..");
		
		// Delete a node
		String delete_item = new String("India1");
		System.out.println("Deleting a node " + delete_item);
		singlyLinkedList.deleteNode(delete_item);
		
		System.out.println("Size of List: " + singlyLinkedList.size());
		
		// Print all nodes
		singlyLinkedList.printSinglyLinkedList();
	}
}
