package com.stack;

//Java program to implement a stack that supports 
//getMinimum() in O(1) time and O(1) extra space. 
import java.util.*;

//A user defined stack that supports getMin() in 
//addition to push() and pop() 
class getMaxAtPOP {
	Stack<Integer> s;
	Integer maxEle;

	// Constructor
	getMaxAtPOP() { 
		s = new Stack<Integer>(); 
	}

	// Prints minimum element of MyStack
	void getMax() {
		if (s.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Minimum Element in the stack is: " + maxEle);
	}

	// prints top element of MyStack
	void peek() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty ");
			return;
		}

		Integer t = s.peek(); // Top element.

		System.out.print("Top Most Element is: ");
		if(t > maxEle) 
            System.out.print(maxEle); 
        else
            System.out.print(t); 
	}

	// Removes the top element from MyStack
	void pop() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.print("Top Most Element Removed: ");
		Integer t = s.pop();

		// Minimum will change as the minimum element
		// of the stack is being removed.
		if (t > maxEle) {
			System.out.println(maxEle);
			maxEle = 2 * maxEle - t;
		}

		else
			System.out.println(t);
	}

	// Insert new number into MyStack
	void push(Integer x) {
		if (s.isEmpty()) {
			maxEle = x;
			s.push(x);
			System.out.println("Number Inserted: " + x);
			return;
		}

		// If new number is less than original minEle
		if (x > maxEle) {
			s.push(2 * x - maxEle);
			maxEle = x;
		}

		else
			s.push(x);

		System.out.println("Number Inserted: " + x);
	}
	
	public static void main(String[] args) {
		getMaxAtPOP s = new getMaxAtPOP();
		s.push(3); 
	    s.push(5); 
	    s.getMax(); 
	    s.push(7); 
	    s.push(19); 
	    s.getMax(); 
	    s.pop(); 
	    s.getMax(); 
	    s.pop(); 
	    s.peek(); 
	}
};
