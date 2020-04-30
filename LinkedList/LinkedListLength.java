package com.linkedlist;

public class LinkedListLength {

	private Node head;
	
	public LinkedListLength() {
		this.head = null;
	}
	
	public Node insert(int data) {
		if(head == null) {
			head = new Node(data);
		}else {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
		}
		return head;
	}
	
	public int printLengthUsingIterative() {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	public int printLegthUsingRecursion(Node node) {
		if(node == null) {
			return 0;
		} else{
			return 1 + printLegthUsingRecursion(node.next);
		}
	}
	
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		LinkedListLength ll = new LinkedListLength();
		ll.insert(5);
		ll.insert(8);
		ll.insert(9);
		ll.insert(15);
		
		ll.print();
		
		System.out.println("Iterative " + ll.printLengthUsingIterative());
		System.out.println("Recursive " + ll.printLegthUsingRecursion(ll.head));
	}
}
