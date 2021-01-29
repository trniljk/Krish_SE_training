package javafundamentals.Collection;

import java.util.HashSet;
import java.util.*;

public class HashSetExample {
	public HashSetExample() {
		this.hashSetImplement();
	}
	private void hashSetImplement() {
		Set<String> bikeSet = new HashSet<String>();
		bikeSet.add("Honda");
		bikeSet.add("Yamaha");
		bikeSet.add("TVS");
		bikeSet.add("Ducati");
		bikeSet.add("Yamaha");
		System.out.println(bikeSet);
		Iterator<String> iterator= bikeSet.iterator();
		
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.print(string+" ");
		}
		System.out.println();
		System.out.println(bikeSet.iterator().next());
//		
//				[TVS, Yamaha, Ducati, Honda]
//				TVS Yamaha Ducati Honda 
//				TVS

		
	}

}
