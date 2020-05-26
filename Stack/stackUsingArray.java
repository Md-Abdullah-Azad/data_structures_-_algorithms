package com.stack;

public class stackUsingArray {

	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];

	boolean isEmpty() {
		return (top < 0);
	}

	stackUsingArray() {
		top = -1;
	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			// System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}

	static void PrintStack(stackUsingArray s) {
		if (s.isEmpty()) {
			return;
		}
		int x = s.peek();
		s.pop();
		PrintStack(s);
		System.out.print(x + " ");
		s.push(x);
	}

	public static void main(String args[]) {
		stackUsingArray s = new stackUsingArray();
		s.push(10);
		s.push(20);
		s.push(30);
		PrintStack(s);
	}
}
