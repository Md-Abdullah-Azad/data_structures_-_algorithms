package com.linkedlist;

public class Node {

	public int data;
	public Node next;
	
	public Node() {
		this.next = null;
	}
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	@Override
	public String toString() {
         StringBuffer sb = new StringBuffer();
         sb.append("Node Key ->"+this.data+" Next Node Value is ->"+next.data);
		return sb.toString();
	}
	
}

