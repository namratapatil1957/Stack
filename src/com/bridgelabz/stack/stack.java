package com.bridgelabz.stack;
import java.util.*;

public class stack {
	
	int num;
	static List <Integer> list = new ArrayList(); 
	
	public static void main(String[] args) {
		
		stack st = new stack();
		
		st.push();
		
	}
	
	void push() {
		
		list.add(70);
		list.add(30);
		list.add(56);
		System.out.println(" \n The stack is: " + list);
	}
	

}
