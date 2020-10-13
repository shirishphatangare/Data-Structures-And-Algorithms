package data_structures.hashtable;


/*
1) Hashtable data structure is known for its faster insertion and retrieval of data (almost in constant time).
2) In hashtable key-value pairs are stored
3) For simplicity in this implementation we have used int key and values, but it can be of any Object type
*/
public class HashTable {
 
	HashLinkedList[] hashArray;
	
	public HashTable(int size){
		hashArray = new HashLinkedList[size];
	}
	
	// Simple hashing function to convert natural number representation of key to an index of hashArray
	// With hashing technique, we can map key of any type to a random integer index of an array.
	// Good hash function should distribute keys uniformly into slots.
	// Here for simplicity, I provided keys as natural numbers representation. However, 
	// In reality, if we want to use a custom object as a key of hashtable, we need to override a hashCode() function.
	// Hashcode() function provides natural number representation of a custom object. 
	// These natural numbers are further converted (hashed) to an integer index of an underlying array.
	// An ideal hashcode() method gives different hashcodes for different objects. This can improve performance of hastable 
	// drastically by distributing objects uniformly and avoiding a collision. 
	private int hashing(int key){
		return key % hashArray.length;
	}
	
	// Collision can be resolved with chaining (Linked List at each array index)
	// In case of collision, a Linked list will have multiple nodes
	
	private void insertInLinkedList(int hashArrayIndex, int key, int value) {
		HashLinkedList hashLinkedList = null;
		
		if(hashArray[hashArrayIndex] == null){
			hashLinkedList = new HashLinkedList();
			hashArray[hashArrayIndex] = hashLinkedList;
		}else{
			hashLinkedList = hashArray[hashArrayIndex];
		}
		hashLinkedList.addNode(key, value);
	} 
	
	public int findInLinkedList(int hashArrayIndex, int key) {
		HashLinkedList hashLinkedList = null;
		
		if(hashArray[hashArrayIndex] == null){
			return -1;
		} else {
			hashLinkedList = hashArray[hashArrayIndex];
			return hashLinkedList.findNode(key);
		}
	}
	
	// n = Size of input keys
	// m = size of an underlying array
	// In Java, load factor of hashtable/hashmap is kept constant (0.75). 
	// Capacity(m) of underlying array changes with changing input (n) to keep load factor(n/m) constant.
	// This helps in faster insertion and retrieval of data in hashtable almost in constant time.
	
	public void put(int key, int value) {
		int hashArrayIndex = hashing(key);
		insertInLinkedList(hashArrayIndex,key,value);
	}
	
	public int get(int key) {
		int hashArrayIndex = hashing(key);
		return findInLinkedList(hashArrayIndex,key);
	}
	
	public int size() {
		HashLinkedList hashLinkedList = null;
		int hashTableSize = 0;
		
		for(int i=0; i<hashArray.length;i++){
			hashLinkedList = hashArray[i];
			if (hashLinkedList != null){
				hashTableSize = hashTableSize + hashLinkedList.size();
			}
		}
		return hashTableSize;
	}
	
	
	public void printHashTable() {
		HashLinkedList hashLinkedList = null;
		
		for(int i=0; i<hashArray.length;i++){
			hashLinkedList = hashArray[i];
			if (hashLinkedList != null){
				System.out.println("Printing a hash bucket for index " + i);
				hashLinkedList.printHashLinkedList();
			}
		}
	}

	
	public boolean remove(int key) {
		HashLinkedList hashLinkedList = null;
		int hashArrayIndex = hashing(key);
		
		if(hashArray[hashArrayIndex] != null){
			hashLinkedList = hashArray[hashArrayIndex];
			if(hashLinkedList.findNode(key) != -1) {
				hashLinkedList.deleteNode(key);
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
}
