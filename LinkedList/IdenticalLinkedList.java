package com.linkedlist;

public class IdenticalLinkedList {
	private Node head;

	public IdenticalLinkedList() {
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

	public boolean IsIdentical(IdenticalLinkedList ll2) {
		Node a = this.head, b = ll2.head;
		while (a != null && b != null) {
			if (a.data != b.data) {
				System.out.println("Not Identical");
				return false;
			}
			a = a.next;
			b = b.next;
		}
		return (a == null && b == null);
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
		IdenticalLinkedList ll1 = new IdenticalLinkedList();
		ll1.insert(10);
		ll1.insert(20);
		ll1.insert(30);
		ll1.insert(40);

		IdenticalLinkedList ll2 = new IdenticalLinkedList();
		ll2.insert(10);
		ll2.insert(20);
		ll2.insert(30);
		ll2.insert(40);

		System.out.println("1st Linked list");
		ll1.print();
		System.out.println("2nd Linked list");
		ll2.print();

		System.out.println("Is both Linked list Identical");
		boolean isIdentical = ll1.IsIdentical(ll2);
		System.out.println(isIdentical);
	}
}
