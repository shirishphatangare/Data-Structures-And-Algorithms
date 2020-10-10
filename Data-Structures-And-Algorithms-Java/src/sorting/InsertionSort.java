package sorting;

// Worst case Time complexity - O(n²)
// Consider analogy of a card game. 
// All cards in hand are always sorted.
// Pick a new card from suite and insert it in hand such a way that all cards in hand are sorted  
public class InsertionSort {
	
	int[] input;
	
	public InsertionSort(int[] input) {
		this.input = input;
	}
	
	public void sort() {
		for(int i=0 ; i<input.length; i++) {
			int current = input[i]; // 'current' is new card being drawn from suite 
			int j = i-1; // Start comparison of a new card with cards in hand from right to left
			
			while(j>=0 && input[j] > current) { // j moves from right end of an array to left (while comparing with new card)
				input[j+1] = input[j]; // Make slot for new card
				j = j-1; // Move to left
			}
			input[j+1] = current; // insert new card in slot
		}
	}
	
	public void printArray() {
		for (int i=0; i<input.length;i++) { 
			System.out.println(input[i]);
		}
	}

}
























// 0⁰₀ 1¹₁ 2²₂3³₃ 4⁴₄ 5⁵₅ 6⁶₆ 7⁷₇ 8⁸₈ 9⁹₉