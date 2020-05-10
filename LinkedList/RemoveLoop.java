package com.linkedlist;

public class RemoveLoop {
	private Node head;

	public RemoveLoop() {
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
		Node slow = head, fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				removeLoop(fast, head);
				return true;
			}
		}
		return false;
	}

	void removeLoop(Node loopPoint, Node curr) {
		Node slow = head;
		Node fast = loopPoint;
	    while(slow.next != fast.next){
	        slow = slow.next;
	        fast = fast.next;
	    }
	    fast.next = null;
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
		RemoveLoop ll = new RemoveLoop();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);

		ll.print();
		/* Create loop for testing */
		// ll.head.next.next.next.next.next = ll.head;
		ll.head.next.next.next.next = ll.head.next;
		System.out.println(ll.detectLoop());
		ll.print();
	}
}
