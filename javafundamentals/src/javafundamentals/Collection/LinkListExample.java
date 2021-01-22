package javafundamentals.Collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

import javax.management.Query;

public class LinkListExample {
	public LinkListExample() {
		this.listImpliment();
	}
	public void listImpliment() {
		LinkedList<String> bikes =new LinkedList<String>();
		bikes.add("Honda");
		bikes.add("Yamaha");
		bikes.add("Royal Enfil");
		bikes.add("Honda");
		
		System.out.println(bikes);
		bikes.add("TVS");
		System.out.println(bikes);
		bikes.addFirst("Hero");
		bikes.addLast("Ducati");
		System.out.println(bikes);
		bikes.removeFirst();
		bikes.removeLast();
		System.out.println(bikes);
		System.out.println(bikes.remove("Honda"));
		System.out.println(bikes.indexOf("Yamaha"));
		System.out.println(bikes.poll());
		System.out.println(bikes);
		
//		ListIterator<String> listIterator = bikes.listIterator();
//		while (listIterator.hasNext()) {
//			String string = listIterator.next();
//			System.out.print(string+" ");	
//		}
		
		Queue<String> bikes2 =new LinkedList<String>();
		bikes2 = (Queue<String>)bikes.clone();
		System.out.println(bikes2);
		System.out.println(bikes2.poll());
	}
}
