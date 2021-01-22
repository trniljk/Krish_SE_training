package javafundamentals.sorting;

import java.util.Arrays;

public class SelectionSort {
	int array [];
	public SelectionSort(int array[]) {
		this.array =array;
		sortingArray();
	}
	
	public int[] sortingArray() {		
			
		for (int i = 0; i < array.length-1; i++) {
			int minIndex = i;
			
			for (int j = i+1; j < array.length; j++) {
							
				if(array[minIndex]>array[j])
					minIndex = j;							
			}
			
			if(minIndex!=i)
				swapVariable(i, minIndex);
			
			System.out.println(Arrays.toString(array));;
			
		}
		System.out.print("Sorted Array :: "+Arrays.toString(array));
		
		
		System.out.println();
		
		return this.array;
		
	}
	
	public void swapVariable(int firstVariable, int secondVariable) { 
		int temp = array[firstVariable];
		array[firstVariable] = array[secondVariable];
		array[secondVariable] = temp;		
	}
}
