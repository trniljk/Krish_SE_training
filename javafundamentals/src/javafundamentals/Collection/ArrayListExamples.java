package javafundamentals.Collection;

import java.util.*;

public class ArrayListExamples {
	public ArrayListExamples() {
		this.listImpliments();
	}
	public void listImpliments() {
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		for (int i = 1; oddNumbers.size()!= 10; i+=2) {//i +=2 equal to i = (cast to type of i)(i+2)			
			oddNumbers.add(i);//auto boxing apply here			
		}
		
		//for each
		for (Integer integer : oddNumbers) {
			System.out.print(integer.intValue()+" ");
		}
		System.out.println();
		
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
		
		
		//iterator
		Iterator<Integer> iterator = evenNumbers.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			System.out.print(integer+" ");			
		}
		
		System.out.println();
		
		oddNumbers.add(4, 89);
		System.out.println(oddNumbers);
		//sorting reverse
		Collections.sort(oddNumbers,Collections.reverseOrder());
		
		//list iterator
		ListIterator<Integer> listIterator = oddNumbers.listIterator();
		while (listIterator.hasNext()) {
			Integer integer = listIterator.next();
			System.out.print(integer+" ");	
		}
		System.out.println();
		
//		1 3 5 7 9 11 13 15 17 19 
//		2 4 6 8 10 12 14 16 18 20 
//		[1, 3, 5, 7, 89, 9, 11, 13, 15, 17, 19]
//		89 19 17 15 13 11 9 7 5 3 1 
		
		
	}

}
