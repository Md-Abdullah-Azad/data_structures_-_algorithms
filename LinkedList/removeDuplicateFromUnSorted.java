package com.linkedlist;

import java.util.HashSet;

public class removeDuplicateFromUnSorted {
	private Node head;

	public removeDuplicateFromUnSorted() {
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

	public void removeDuplicateUsingDualLoop() {
		Node ptr1 = null, ptr2 = null;
		ptr1 = head;

		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			while (ptr2.next != null) {
				if (ptr1.data == ptr2.next.data) {
					ptr2.next = ptr2.next.next;
				} else {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}

	public void removeDuplicateUsingHashing() {

		HashSet<Integer> hs = new HashSet<>();
		Node current = head;
		Node prev = null;
		while (current != null) {
			
			int curval = current.data;
			if (hs.contains(curval)) {
				prev.next = current.next;
			} else {
				hs.add(curval);
				prev = current;
			}
			current = current.next;
		}
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
		removeDuplicateFromUnSorted ll = new removeDuplicateFromUnSorted();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(50);
		ll.insert(30);
		ll.insert(40);
		ll.insert(10);
		ll.insert(50);

		System.out.println("List before removal of duplicates");
		ll.print();

		System.out.println();
		ll.removeDuplicateUsingDualLoop();

		System.out.println("List after removal of elements");
		ll.print();
	}
}
