package javafundamentals.searching;
import javafundamentals.sorting.SelectionSort;
public class SearchingTechniques {

	public static void main(String[] args) {
		int [] array = {2,6,4,5,89,54,3};
		int [] sortedArray = new SelectionSort(array).sortingArray();
		BinarySearch search = new BinarySearch(sortedArray);
		search.searching(5);
		//BinarySearchTree tree =new BinarySearchTree();
		//tree.printTree(tree.sortedArrayToBST(sortedArray, 0, array.length-1));
	}

}
