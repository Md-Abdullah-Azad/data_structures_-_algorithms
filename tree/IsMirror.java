package com.tree;

public class IsMirror {

	Node root;

	static boolean isMirror(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		if ((node1 == null || node2 == null)) {
			return false;
		}
		if (node1.data == node2.data) {
			return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
		}
		return false;

	}

	public static void main(String[] args) {

		Node root1 = new Node(1);
		Node root2 = new Node(1);
		
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);

		root2.left = new Node(3);
		root2.right = new Node(2);
		root2.right.left = new Node(5);
		root2.right.right = new Node(4);

		System.out.println(isMirror(root1, root2));

	}
}
