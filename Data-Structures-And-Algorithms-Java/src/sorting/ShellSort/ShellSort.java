package sorting.ShellSort;


// Worst case Time complexity - range O(n^7/6) to O(n^3/2)
// Performance mucn better than insertion sort
// Shell sort is nothing but improved insertion sort
// Insertion sort good for small arrays, where as Shell sort good for medium-sized arrays (upto few thousands)

public class ShellSort {

	public void sort(Integer[] data) {
		if (data == null || data.length == 0)
			return;
		
		int knuthNum = maxKnuthSeqNumber(data.length);
		while (knuthNum >= 1) {
			for (int i = 0; i < knuthNum; i++) { 
				// internally we use insertion sort for each pass
				insertionSortWithGap(data, i, knuthNum); // pass knuthNum as gap between data items
			}
			knuthNum = (knuthNum-1)/3; //decrease the gap
		}
	}
	
	// InsertionSort Implementation with changing startIndex and gap
	private void insertionSortWithGap(Integer[] data, int startIndex, int gap) {
		int i = startIndex;
		while (i < data.length) {
			int current = data[i];
			int j = i-gap;
			while (j >=0 && data[j] >= current) {
				data[j+gap] = data[j];
				j = j - gap;
			}
			data[j+gap] = current;
			i = i + gap;
		}
	}
	
	private int maxKnuthSeqNumber(int size) {
		int h = 1;
		while (h < size/3) { 
			h = 3 * h + 1;
		}
		return h;
	}		
			
}
