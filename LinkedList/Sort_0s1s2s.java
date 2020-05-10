package com.linkedlist;

public class Sort_0s1s2s {
	private Node head;

	public Sort_0s1s2s() {
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

	public void sortList() {
		int count[] = { 0, 0, 0 };
		Node temp = head;

		while(temp.next != null) {
			count[temp.data]++;
			temp = temp.next;
		}

		int index = 0;
		temp = head;
		while(temp.next != null) {
			if (count[index] == 0) {
				index++;
			} else {
				temp.data = index;
				--count[index];
				temp = temp.next;
			}
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
		Sort_0s1s2s ll = new Sort_0s1s2s();
		ll.insert(0);
		ll.insert(1);
		ll.insert(0);
		ll.insert(2);
		ll.insert(1);
		ll.insert(1);
		ll.insert(2);
		ll.insert(1);
		ll.insert(2);

		System.out.println("Linked List before sorting");
		ll.print();

		ll.sortList();

		System.out.println("Linked List after sorting");
		ll.print();
	}
}
