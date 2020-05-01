package com.linkedlist;

public class Seacrch {
	private Node head;

	public Seacrch() {
		this.head = null;
	}

	public Node insert(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
		}
		return head;
	}
	
	public boolean iterativeSearch(int data) {
		Node temp = head;
		boolean isFound = false;
		while(temp != null) {
			if(temp.data == data) {
				isFound = true;
				break;
			}
			temp = temp.next;
		}
		return isFound;
	}
	
	public boolean recursiveSearch(Node head, int data) {
		if(head == null) { return false; }
		if(head.data == data) { return true; }
		return recursiveSearch(head.next, data);
	}
	
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Seacrch ll = new Seacrch();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.insert(60);

		ll.print();

		System.out.println("searching value 40 (Iterative) " + ll.iterativeSearch(40));
		System.out.println("searching value 40 (Recursive) " + ll.recursiveSearch(ll.head, 40));
		
		System.out.println("searching value 35 (Iterative) " + ll.iterativeSearch(35));
		System.out.println("searching value 35 (Recursive) " + ll.recursiveSearch(ll.head, 35));
	}

}
