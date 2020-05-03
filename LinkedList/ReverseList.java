package com.linkedlist;

public class ReverseList {
	private Node head;

	public ReverseList() {
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

	public void Reverse() {
		Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev;
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
		ReverseList ll = new ReverseList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);

		System.out.println("Linked list before reverse");  
		ll.print();
		
		System.out.println("Linked list after reverse"); 
		ll.Reverse();
		ll.print();
	}
}
