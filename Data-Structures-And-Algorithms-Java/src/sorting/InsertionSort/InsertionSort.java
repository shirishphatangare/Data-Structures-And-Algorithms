package sorting.InsertionSort;

// Worst case Time complexity - O(n^²)
// Consider analogy of a card game. 
// All cards in hand are always sorted.
// Pick a new card from suite and insert it in hand such a way that all cards in hand are sorted  
public class InsertionSort {
	
	Integer[] input;
	
	public InsertionSort(Integer[] input) {
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
























// 0â�°â‚€ 1Â¹â‚� 2Â²â‚‚3Â³â‚ƒ 4â�´â‚„ 5â�µâ‚… 6â�¶â‚† 7â�·â‚‡ 8â�¸â‚ˆ 9â�¹â‚‰