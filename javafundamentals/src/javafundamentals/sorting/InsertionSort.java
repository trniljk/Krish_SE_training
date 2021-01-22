package javafundamentals.sorting;

import java.util.Arrays;

//import java.util.Arrays;

public class InsertionSort {
	int array [] ;
	
	public InsertionSort(int array[]) {
		this.array = array;
		sortingArray();
	}
	public  void sortingArray() {
		
		for (int i = 1; i <= array.length-1; i++) {
			for (int j = i; j > 0; j--) {
				if(array[j]<array[j-1]) {
					swapVariable(j,j-1);
				}else {
					break;
				}
			}
			
			System.out.println(Arrays.toString(array));;
		}
		System.out.print("Sorted Array ::  "+Arrays.toString(array));
		
	}
	public void swapVariable(int firstVariable, int secondVariable) { 
		int temp = array[firstVariable];
		array[firstVariable] = array[secondVariable];
		array[secondVariable] = temp;		
	}

}
