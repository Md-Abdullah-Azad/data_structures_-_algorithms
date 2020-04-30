package com.linkedlist;

public class InsertNodeAtEnd {

	private Node head;
	public InsertNodeAtEnd() {
		this.head = null;
	}
	
	public Node InsertNodeAtEnd(int data) {
		if(head == null) {
			head = new Node(data);
		}else {
			Node node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = new Node(data);
		}
		return head;
	}
	
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		InsertNodeAtEnd ll = new InsertNodeAtEnd();
		ll.InsertNodeAtEnd(4);
		ll.InsertNodeAtEnd(5);
		ll.InsertNodeAtEnd(6);
		
		ll.print();
	}
}
