package com.linkedlist;

class RightRotateBy_K_Node {

	private Node head;
	public Node push(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
		}
		return head;
	}

	/* A utility function to print linked list */
	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.print("null");
	}

	// Function that rotates the given linked list 
	// clockwise by k and returns the updated 
	// head pointer 
	static Node rightRotate(Node head, int k) {

		// If the linked list is empty
		if (head == null)
			return head;

		// len is used to store length of the linked list
		// tmp will point to the last node after this loop
		Node tmp = head;
		int len = 1;
		while (tmp.next != null) {
			tmp = tmp.next;
			len++;
		}

		// If k is greater than the size
		// of the linked list
		if (k > len)
			k = k % len;

		// Subtract from length to convert
		// it into left rotation
		k = len - k;

		// If no rotation needed then
		// return the head node
		if (k == 0)
			return head;

		// current will either point to
		// kth or null after this loop
		Node current = head;
		int cnt = 1;
		while (cnt < k && current != null) {
			current = current.next;
			cnt++;
		}

		// If current is null then k is equal to the
		// count of nodes in the list
		// Don't change the list in this case
		if (current == null)
			return head;

		// current points to the kth node
		Node kthnode = current;

		// Change next of last node to previous head
		tmp.next = head;

		// Change head to (k+1)th node
		head = kthnode.next;

		// Change next of kth node to null
		kthnode.next = null;

		// Return the updated head pointer
		return head;
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
	
	public static void main(String args[]) {
		
		RightRotateBy_K_Node ll = new RightRotateBy_K_Node();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);

		int k = 2;

		System.out.println("List before right rotation");
		ll.print();

		System.out.println();
		Node updated_head = rightRotate(ll.head, k);

		System.out.println("List after right rotation");
		printList(updated_head);
	}
}
