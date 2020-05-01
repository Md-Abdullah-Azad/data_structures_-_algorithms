package com.linkedlist;

public class Intersection {
	private Node head;

	public Intersection() {
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

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	boolean isPresent(Node head, int data) {
		Node t = head;
		while (t != null) {
			if (t.data == data)
				return true;
			t = t.next;
		}
		return false;
	}

	public void getIntersection(Node head1, Node head2) {
		Node result = null;
		Node t1 = head1;
		while (t1 != null) {
			if (isPresent(head2, t1.data))
				push(t1.data);
			t1 = t1.next;
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
	
	public static void main(String args[]) 
    { 
		Intersection llist1 = new Intersection(); 
		Intersection llist2 = new Intersection();
        Intersection intersecn = new Intersection(); 
  
        /*create a linked lits 10->15->5->20 */
        llist1.push(20); 
        llist1.push(4); 
        llist1.push(15); 
        llist1.push(10); 
  
        /*create a linked lits 8->4->2->10 */
        llist2.push(10); 
        llist2.push(2); 
        llist2.push(4); 
        llist2.push(8); 
  
        intersecn.getIntersection(llist1.head, llist2.head); 
  
        System.out.println("First List is"); 
        llist1.print(); 
  
        System.out.println("Second List is"); 
        llist2.print(); 
  
        System.out.println("Intersection List is"); 
        intersecn.print();
    } 
}
