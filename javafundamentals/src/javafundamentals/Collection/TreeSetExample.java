package javafundamentals.Collection;

import java.util.*;

public class TreeSetExample {
	TreeSet<String> tree = new TreeSet<String>();
	public TreeSetExample() {
		this.implimentation();
	}
	private void implimentation() {
		tree.add("Java");
		tree.add("C#");
		tree.add("Python");
		tree.add("C++");
		tree.add("Java");
		System.out.println(tree);
		System.out.println("Contains " + "C#" + " " + tree.contains("C#"));
		System.out.println("Last::"+tree.last());
//		[C#, C++, Java, Python]
//		Contains C# true
//		Last::Python
	}
			

}
