package com.tree;

public class Size {
	Node root;

	Size() {
		root = null;
	}

	int printSize(Node node) {

		if (node == null) {
			return 0;
		}else {
			return printSize(node.left) + printSize(node.right) + 1;
		}
	}

	int printSizeRecursive() {
		return printSize(root);
	}
	
	public static void main(String[] args) {

		Size tree = new Size();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.print("Size of binary tree is : ");
		System.out.print(tree.printSizeRecursive());
	}
}
