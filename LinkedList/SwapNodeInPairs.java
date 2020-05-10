package com.linkedlist;

public class SwapNodeInPairs {
	private Node head;

	public SwapNodeInPairs() {
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

	public void pairWiseSwap_ItertaiveApproach() {
		Node temp = head; 
        while (temp != null && temp.next != null) { 
            int k = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = k; 
            temp = temp.next.next; 
        } 
        
	}
	
	public static void pairWiseSwap_RecursiveApproach(Node temp) {
		if (temp != null && temp.next != null) {
			int k = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = k;
            temp = temp.next.next;
            pairWiseSwap_RecursiveApproach(temp.next.next); 
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
		SwapNodeInPairs ll = new SwapNodeInPairs();
		ll.insert(70);
		ll.insert(60);
		ll.insert(50);
		ll.insert(40);
		ll.insert(30);
		ll.insert(20);
		ll.insert(10);

		System.out.println("Actual Linked list");  
		ll.print();
		
		System.out.println("Afetr swap - Iterative approach"); 
		ll.pairWiseSwap_ItertaiveApproach();
		ll.print();
		
		System.out.println("Afetr swap - Iterative approach"); 
		pairWiseSwap_RecursiveApproach(ll.head);
		ll.print();
	}
}
