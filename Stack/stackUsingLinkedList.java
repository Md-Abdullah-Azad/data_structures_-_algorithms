package com.stack;

import com.linkedlist.Node;

public class stackUsingLinkedList {
	private Node top;

	public stackUsingLinkedList() {
		this.top = null;
	}

	public void push(int x) {
		Node temp = new Node();
		temp.data = x;
		temp.next = top;
		top = temp;
	}

	public boolean isEmpty() {
		return this.top == null;
	}

	public int peek() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.print("\nStack Underflow");
			return;
		}
		top = top.next;
	}
	
	public void printStack() {
		if (top == null) {
			System.out.printf("\nStack Underflow");
			return;
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.printf("%d->", temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String args[]) {

		stackUsingLinkedList s = new stackUsingLinkedList();
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(44);
		s.printStack();
		System.out.printf("\nTop element is %d\n", s.peek());
		s.pop();
		s.pop();
		s.printStack();
		System.out.printf("\nTop element is %d\n", s.peek());

	}
}
