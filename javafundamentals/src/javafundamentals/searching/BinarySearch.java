package javafundamentals.searching;

public class BinarySearch {
	
	int sortedArray[]= {2,3,5,7,9,65,78};
	public BinarySearch(int sortedArray [] ) {
		this.sortedArray = sortedArray;
	}
	
	public void searching(int search) {
		
		int index = -1;
		
		int lowerBound = 0;
		int upperBound = (sortedArray.length)-1;
		int midPoint;
	
		while (lowerBound<=upperBound) {
			
			midPoint = lowerBound+(upperBound-lowerBound)/2;
			
			if(sortedArray[midPoint] == search)
				index = midPoint;
			if(search>sortedArray[midPoint]) {
				lowerBound = midPoint+1;
			}else {
				upperBound = midPoint -1;
			}
		}
		if(index==-1) {
			System.out.println("searched integer not found");
		}else {
			System.out.println("Search::"+search+ "\nindex::" +index );
			
		}
	}
}
//[2, 3, 4, 5, 6, 54, 89]
//[2, 3, 4, 5, 6, 54, 89]
//[2, 3, 4, 5, 6, 54, 89]
//[2, 3, 4, 5, 6, 54, 89]
//[2, 3, 4, 5, 6, 54, 89]
//[2, 3, 4, 5, 6, 54, 89]
//Sorted Array :: [2, 3, 4, 5, 6, 54, 89]
//Search::5
//index::3
