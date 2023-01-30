package com.bridgelabz.stack;
import java.util.*;

public class stack {
	
	int num;
	static List <Integer> list = new ArrayList(); 
	
	public static void main(String[] args) {
		
		stack st = new stack();
		
		st.push();
		st.peek();
		st.pop();
		st.peek();
	}
	
	void push() {
		
		list.add(70);
		list.add(30);
		list.add(56);
		System.out.println(" \n The stack is: " + list);
	}
	
	void peek() {
		
		int peek = list.get(list.size() - 1);
		System.out.println(" The element present at peek is " + peek);
	}
	
	void pop() {
		
		int remove = list.remove(list.size() - 1);
		System.out.println(" \n The pop element is " + remove);
		System.out.println(" \n The stack elements are " + list);
	}

}
