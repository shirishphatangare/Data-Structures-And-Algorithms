package sorting;

public class PartitionLogic {

	public static void main(String[] args) {
		//PartitionLogic partition = new PartitionLogic();
		int[] A = {23,5,2,8,12,7,16,9,14};
		int start = 0;
		int end = A.length - 1;
//		int pivot;
		printArray(A);
//		System.out.println("Partition(A," + start + "," + end + ")");
//		pivot = partition.doPartition(A,start,end);
//		System.out.println("pivot = " + pivot);
		quickSort(A, start, end);
		System.out.println("Sorted Array A ");
		printArray(A);
		
		
	}
	
	public static int doPartition(int[] A, int start, int end) {
		int pivot = A[end];
		System.out.println("Pivot-Value = A[" + end + "] = " + pivot);
		int i = start;
		
		for(int j=i; j<=end-1; j++) {
			if(A[j] <= pivot) {
				System.out.println("Exchanging A[" + i + "] with A[" + j + "]");
				int temp1 = A[i];
				A[i] = A[j];
				A[j] = temp1;
				i++;
			}
		}
		
		System.out.println("Array state of A after Exchange steps:");
		printArray(A);
		
		System.out.println("Moving PIVOT to index " + i + " Exchanging A[" + i + "] with A[" + end + "]");
		int temp2 = A[i];
		A[i] = A[end];
		A[end] = temp2;
		
		return i;
	}
	
	
	public static  void printArray(int[] A) {
		for (int i=0; i< A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void quickSort(int[] A, int start, int end) {
		System.out.println("Calling Quicksort on A with start = " + start + " and end = " + end);
		if(start < end) {
			System.out.println("Partition(A," + start + "," + end + ")");
			int pivot = doPartition(A,start,end);
			System.out.println("pivot-index = " + pivot); 
			System.out.println("Array state of A after partition ");
			printArray(A);
			
			quickSort(A, start, pivot-1);
			quickSort(A, pivot+1, end);
			
		}else {
			System.out.println("Breaking condition reached for start = " + start + " and end = " + end);
		}
	}

}
