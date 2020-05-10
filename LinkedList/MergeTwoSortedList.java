package com.linkedlist;

public class MergeTwoSortedList {
	private Node head;

	public MergeTwoSortedList() {
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

	public static void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(" ");
	}

	
	public static Node SortedMerge(Node A, Node B) {

		if (A == null)
			return B;
		if (B == null)
			return A;

		if (A.data > B.data) {
			A.next = SortedMerge(A.next, B);
			return A;
		} else {
			B.next = SortedMerge(A, B.next);
			return B;
		}

	}

	public static void main(String[] args) {
		MergeTwoSortedList list1 = new MergeTwoSortedList();
		list1.insert(5);
		list1.insert(15);
		list1.insert(25);
		list1.insert(35);

		MergeTwoSortedList list2 = new MergeTwoSortedList();
		list2.insert(10);
		list2.insert(20);
		list2.insert(30);
		list2.insert(40);

		print(list1.head);
		print(list2.head);

		Node head = SortedMerge(list1.head, list2.head);
		
	    print(head);
	}
}
