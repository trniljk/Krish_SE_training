package javafundamentals.sorting;

public class BubbleSort {
	int array[];
	boolean swap; // 
	
	public BubbleSort(int array[]) {
		this.array = array;
		sortingArray();
	}
	public void sortingArray() {
		 
		for (int i = 1; i <= array.length; i++) {
			
			swap = true;
			for (int j = 0; j < array.length-i; j++) {
				if(array[j]>array[j+1]) 
					swapVariable(j, j+1);
			}
			
			if (swap)//end the loop after sorting complete
				break;
			
			for (int element: array) {
	            System.out.print(element);
	        }
			
			System.out.println();
			
		}
	}
	public void swapVariable(int firstVariable, int secondVariable) { 
		int temp = array[firstVariable];
		array[firstVariable] = array[secondVariable];
		array[secondVariable] = temp;
		swap = false;
		
	}
}
