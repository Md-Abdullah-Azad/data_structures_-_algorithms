package com.linkedlist;

public class NthNodeFromEnd {
	private Node head;

	public NthNodeFromEnd() {
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

	public void printNthFromLast_UsinglengthApproach(int n) {
		int len = 0; 
        Node temp = head; 
  
        // 1) count the number of nodes in Linked List 
        while (temp != null) { 
            temp = temp.next; 
            len++; 
        } 
  
        // check if value of n is not more than length of the linked list 
        if (len < n) {
            return; 
        }
  
        temp = head; 
  
        // 2) get the (len-n+1)th node from the beginning 
        for (int i = 1; i < len - n + 1; i++) {
            temp = temp.next; 
        }
        System.out.println("Node no. " + n + " from last is " + temp.data);
	}
	
	public void printNthFromLast_UsingTwoPointerApproach(int n) {
		
		Node first_ptr = head; 
        Node second_ptr = head; 
  
        int count = 0; 
        if (head != null) { 
            while (count < n) { 
                if (second_ptr == null) { 
                    System.out.println(n + " is greater than the no of nodes in the list"); 
                    return; 
                } 
                second_ptr = second_ptr.next; 
                count++; 
            } 
            while (second_ptr != null) { 
            	first_ptr = first_ptr.next; 
            	second_ptr = second_ptr.next; 
            } 
            System.out.println("Node no. " + n + " from last is " + first_ptr.data); 
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
		NthNodeFromEnd ll = new NthNodeFromEnd();
		ll.insert(70);
		ll.insert(60);
		ll.insert(50);
		ll.insert(40);
		ll.insert(30);
		ll.insert(20);

		System.out.println("Actual Linked list");  
		ll.print();
		
		System.out.println("Nth node from end - Length approach"); 
		ll.printNthFromLast_UsinglengthApproach(2);
		
		System.out.println("Nth node from end - two pointer approach"); 
		ll.printNthFromLast_UsingTwoPointerApproach(2);
	}
}
