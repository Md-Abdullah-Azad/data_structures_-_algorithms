package com.tree;

public class Postorder {
	
	Node root;
	Postorder() {
		root = null;
	}

	void printPostorder(Node node) {
		if (node == null) {
			return;
		}
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.data + " ");
	}

	void printPostorder() {
		printPostorder(root);
	}

	public static void main(String[] args) {

		Postorder tree = new Postorder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();
	}
}
