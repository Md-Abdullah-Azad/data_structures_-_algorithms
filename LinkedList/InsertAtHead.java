package com.linkedlist;

public class InsertAtHead {

	private Node head;
	public InsertAtHead() {
		this.head = null;
	}
	
	public Node insertAtHead(int data) {
		if(head == null) {
			head = new Node(data);
		}else {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
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
		InsertAtHead ll = new InsertAtHead();
		ll.insertAtHead(4);
		ll.insertAtHead(5);
		ll.insertAtHead(6);
		
		ll.print();
	}
}


