package com.tree;

public class Maximum {
	Node root;

	Maximum() {
		root = null;
	}

	int printMaximum(Node node) {

		if (node == null) {
			return -1;
		}else {
			return Math.max(node.data, Math.max(printMaximum(node.left), printMaximum(node.right)) );
		}
	}

	int printMaximumRecursive() {
		return printMaximum(root);
	}
	
	public static void main(String[] args) {

		Maximum tree = new Maximum();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(13);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.print("Maximum of binary tree is : ");
		System.out.print(tree.printMaximumRecursive());
	}
}
