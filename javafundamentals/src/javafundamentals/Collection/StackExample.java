package javafundamentals.Collection;

import java.util.*;

public class StackExample {
	public StackExample() {
		this.implimentation();
	}
	private void implimentation() {
		Stack<String> stack = new Stack<String>();
		stack.push("Honda");
		stack.push("Yamaha");
		stack.push("TVS");
		stack.push("Hero");
		System.out.println(stack);
		
		stack.add("Royal Enfil");
		System.out.println(stack);
		System.out.println("Peek:" + stack.peek() );
		System.out.println(stack);
		System.out.println("pop:" + stack.pop() );		
		System.out.println(stack);
		stack.add(2,"Bajaj");
		System.out.println(stack);
		
//				[Honda, Yamaha, TVS, Hero]
//				[Honda, Yamaha, TVS, Hero, Royal Enfil]
//				Peek:Royal Enfil
//				[Honda, Yamaha, TVS, Hero, Royal Enfil]
//				pop:Royal Enfil
//				[Honda, Yamaha, TVS, Hero]
//				[Honda, Yamaha, Bajaj, TVS, Hero]

	
		
	}

}
