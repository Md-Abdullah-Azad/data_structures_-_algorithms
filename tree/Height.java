package com.tree;

public class Height {

	Node root;

	Height() {
		root = null;
	}

	int printHeight(Node node) {

		if (node == null) {
			return 0;
		}else {
			return Math.max(printHeight(node.left), printHeight(node.right)) + 1;
		}
	}

	int printHeightRecursive() {
		return printHeight(root);
	}
	
	public static void main(String[] args) {

		Height tree = new Height();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.print("Height of binary tree is : ");
		System.out.print(tree.printHeightRecursive());
	}
}
