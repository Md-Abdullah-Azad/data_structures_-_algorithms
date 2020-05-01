package com.linkedlist;

public class LoopDetection {
	private Node head;

	public LoopDetection() {
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

	boolean detectLoop() {
		if(head == null || head.next == null) { return false; }
		Node slow = head;
		Node fast = head.next;
		while(slow != fast) {
			if(fast == null || fast.next == null) { return false; }
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
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
		LoopDetection ll = new LoopDetection();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);

		ll.print();
		/*Create loop for testing */
        ll.head.next.next.next.next.next = ll.head; 
		System.out.println(ll.detectLoop());
	}
}
