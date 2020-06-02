package com.linkedlist;

public class DeleteNode {

	private Node head;

	public DeleteNode() {
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

	public void deleteNode(Node node) {
		if (node.next == null) {
			node = null;
		}
		node.data = node.next.data;
		node.next = node.next.next;
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
		DeleteNode ll = new DeleteNode();
		ll.insert(5);
		ll.insert(8);
		ll.insert(9);
		ll.insert(15);

		ll.print();
		ll.deleteNode(new Node(9));
		ll.print();
	}
}
