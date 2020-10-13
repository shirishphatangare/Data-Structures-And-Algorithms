package data_structures.hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable(10);
		hashTable.put(501, 101);
		hashTable.put(502, 102);
		hashTable.put(503, 103);
		hashTable.put(504, 104);
		hashTable.put(505, 105);
		hashTable.put(506, 106);
		hashTable.put(507, 107);
		hashTable.put(508, 108);
		hashTable.put(509, 109);
		hashTable.put(510, 110);
		
		hashTable.printHashTable();
		
		System.out.println("------------------------------");
		int key1 = 505;
		System.out.println("Getting value for key " + key1 + ": " + hashTable.get(key1));
		System.out.println("------------------------------");
		System.out.println("Size of HashTable: " + hashTable.size());
		
		System.out.println(hashTable.remove(510));
		hashTable.put(607, 1007);
		hashTable.put(1508, 1808);
		hashTable.put(5209, 1069);
		hashTable.put(5510, 1150);
		
		System.out.println(hashTable.remove(510));
		System.out.println(hashTable.remove(5209));
		System.out.println("------------------------------");
		System.out.println("Size of HashTable: " + hashTable.size());
		hashTable.printHashTable();
		
	}

}
