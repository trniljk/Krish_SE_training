package javafundamentals.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public HashMapExample() {
		this.implimentation();
	}
	private void implimentation() {
		Map<Integer, String> personInformations = new HashMap<Integer, String>();
		personInformations.put(100, "Ishara");
		personInformations.put(1, "Lakmal");
		personInformations.put(1, "Suranga");
		personInformations.put(3, "I");
		
		System.out.println(personInformations);
		System.out.println(personInformations.keySet());
		System.out.println(personInformations.keySet().iterator().next());
		System.out.println(personInformations.values());
		System.out.println(personInformations.get(1));
		
//		{1=Suranga, 3=I, 100=Ishara}
//		[1, 3, 100]
//		1
//		[Suranga, I, Ishara]
//		Suranga

		
	}

}
