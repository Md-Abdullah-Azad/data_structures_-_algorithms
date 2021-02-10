package com.tree;

public class BinaryTree {

	Node root;
	public BinaryTree() {
		this.root = null;
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		System.out.println(tree);
	}
	
}
