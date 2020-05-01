package com.linkedlist;

public class removeDuplicateFromSorted {
	private Node head;

	public removeDuplicateFromSorted() {
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

	public Node removeDuplicate() {
		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.data == temp.next.data) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return head;
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
		removeDuplicateFromSorted ll = new removeDuplicateFromSorted();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(30);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.insert(50);
		
		System.out.println("List before removal of duplicates");
		ll.print();

		System.out.println();
		ll.removeDuplicate();

		System.out.println("List after removal of elements");
		ll.print();
	}
}
